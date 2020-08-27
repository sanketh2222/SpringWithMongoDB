package com.crio.springdatabyte.service;

import com.crio.springdatabyte.model.Comment;
import com.crio.springdatabyte.model.Post;
import com.crio.springdatabyte.model.Stats;
import com.crio.springdatabyte.model.User;
import com.crio.springdatabyte.repository.PostRepository;
import com.crio.springdatabyte.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl implements ForumService {

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

  public List<Post> getPostsByUser(String username) {
    return null;
  }

  public Post getMostPopularPost() {
    return null;
  }

  public List<Comment> getCommentsByUser(String username) {
    return null;
  }
}
