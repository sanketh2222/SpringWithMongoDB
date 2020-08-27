package com.crio.springdatabyte.controller;

import com.crio.springdatabyte.dto.Greeting;
import com.crio.springdatabyte.model.Stats;
import com.crio.springdatabyte.service.ForumService;
import com.crio.springdatabyte.service.ForumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

  @Autowired
  ForumService service;

  @GetMapping("/greeting")
  public Greeting greeting() {
    Stats stats = service.getForumStats();
    String message = "Hello!\n"
        + "Forum stats\n"
        + "---------------"
        + "Number of users: " + stats.getNumUsers()
        + "Number of posts: " + stats.getNumPosts();

    return new Greeting(message);
  }

}