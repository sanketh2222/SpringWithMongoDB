package com.crio.springdatabyte.service;

import com.crio.springdatabyte.model.Comment;
import com.crio.springdatabyte.model.Post;
import com.crio.springdatabyte.model.Stats;
import com.crio.springdatabyte.model.User;
import com.crio.springdatabyte.repository.PostRepository;
import com.crio.springdatabyte.repository.UserRepository;
import com.crio.springdatabyte.repositoryservice.ForumRepositoryServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl implements ForumService {

  @Autowired
  ForumRepositoryServiceImpl forumRepositoryService;

  @Override
  public Stats getForumStats() {
    return forumRepositoryService.getForumStats();
  }

  public List<Post> getPostsByUser(String username) {
    return null;
  }

  public List<Post> getMostRecentPosts(int maxCount) {
    return null;
  }

  public List<Comment> getCommentsByUser(String username) {
    return null;
  }
}
