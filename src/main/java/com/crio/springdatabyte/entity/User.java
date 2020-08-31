package com.crio.springdatabyte.entity;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
@NoArgsConstructor
public class User {

  @Id
  public String id;

  public String username;

  public List<Post> posts;

}
