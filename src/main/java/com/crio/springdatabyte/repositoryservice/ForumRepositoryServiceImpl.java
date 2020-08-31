package com.crio.springdatabyte.repositoryservice;

import com.crio.springdatabyte.dto.Stats;
import com.crio.springdatabyte.dto.User;
import com.crio.springdatabyte.entity.Post;
import com.crio.springdatabyte.entity.UserEntity;
import com.crio.springdatabyte.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumRepositoryServiceImpl implements ForumRepositoryService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Stats getForumStats() {
    List<UserEntity> users = userRepository.findAll();

    return new Stats(users.size());
  }

  @Override
  public List<com.crio.springdatabyte.dto.Post> getPostsByUser(String username) {
    List<UserEntity> userEntityList = userRepository.findByUsername(username);

    List<com.crio.springdatabyte.dto.Post> posts = new ArrayList<>();
    for(UserEntity userEntity : userEntityList) {
      List<Post> postEntityList = userEntity.getPosts();
      for(Post postEntity : postEntityList) {
        posts.add(modelMapper.map(postEntity, com.crio.springdatabyte.dto.Post.class));
      }
    }

    return posts;
  }

  @Override
  public List<User> getUsersWithPostText(String text) {
    List<UserEntity> userEntityList = userRepository.findUsersWithPostText(text);

    List<User> userList = new ArrayList<>();
    for(UserEntity userEntity : userEntityList) {
      userList.add(modelMapper.map(userEntity, User.class));
    }

    return userList;
  }

}
