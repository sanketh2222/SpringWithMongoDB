package com.crio.springdatabyte.repositoryservice;

import com.crio.springdatabyte.model.Post;
import com.crio.springdatabyte.model.Stats;
import com.crio.springdatabyte.model.User;
import com.crio.springdatabyte.repository.PostRepository;
import com.crio.springdatabyte.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumRepositoryServiceImpl implements ForumRepositoryService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  PostRepository postRepository;

  @Override
  public Stats getForumStats() {
    List<User> users = userRepository.findAll();
    List<Post> posts = postRepository.findAll();

    return new Stats(users.size(), posts.size());
  }
}
