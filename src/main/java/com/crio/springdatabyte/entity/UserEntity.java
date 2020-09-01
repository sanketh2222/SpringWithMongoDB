package com.crio.springdatabyte.entity;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@NoArgsConstructor
public class UserEntity {

  @Id
  public String id;

  public String username;

  public List<PostModel> posts;

}
