package com.crio.springdatabyte.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post implements Serializable {
  public int posterId;

  public String link;

  public String content;

  public long postCreatedTimestamp;
}
