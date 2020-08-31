package com.crio.springdatabyte.controller;

import com.crio.springdatabyte.dto.Stats;
import com.crio.springdatabyte.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

  @Autowired
  ForumService service;

  @GetMapping("/greeting")
  public ResponseEntity<String> greeting() {
    Stats stats = service.getForumStats();
    String message = "<p>Hello!</p>"
        + "<div><b>Forum stats</b></div>"
        + "<div>---------------</div>"
        + "<div>Number of users: " + stats.getNumUsers() + "</div>";

    return ResponseEntity.ok().body(message);
  }

}