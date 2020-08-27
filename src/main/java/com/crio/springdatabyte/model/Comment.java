package com.crio.springdatabyte.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

  @NonNull
  public int commenterId;

  @NonNull
  public String link;

  @NonNull
  public String content;

  @NonNull
  public long commentTimestamp;

}
