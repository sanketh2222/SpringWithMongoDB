package com.crio.springdatabyte.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Post {

  public int posterId;

  @NonNull
  public String link;

  @NonNull
  public String content;

  public long postCreatedTimestamp;

}
