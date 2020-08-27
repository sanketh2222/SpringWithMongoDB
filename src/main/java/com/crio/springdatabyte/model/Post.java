package com.crio.springdatabyte.model;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Post {

  @NonNull
  public int posterId;

  @NonNull
  public String link;

  @NonNull
  public String content;

  public List<Comment> comments;

  @NonNull
  public long postCreatedTimestamp;

}
