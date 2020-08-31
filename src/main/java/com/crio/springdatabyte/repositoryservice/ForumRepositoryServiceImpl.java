package com.crio.springdatabyte.repositoryservice;

import com.crio.springdatabyte.dto.Stats;
import com.crio.springdatabyte.entity.User;
import com.crio.springdatabyte.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumRepositoryServiceImpl implements ForumRepositoryService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Stats getForumStats() {
    List<User> users = userRepository.findAll();

    return new Stats(users.size());
  }
}
