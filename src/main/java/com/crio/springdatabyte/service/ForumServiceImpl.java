package com.crio.springdatabyte.service;

import com.crio.springdatabyte.entity.Post;
import com.crio.springdatabyte.dto.Stats;
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

  public List<Post> getMostRecentPostsByUser(String username, int maxCount) {
    return null;
  }
}
