package com.crio.springdatabyte.model;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class User {

  @NonNull
  public int id;

  @NonNull
  public int username;

  public List<Post> posts;

}
