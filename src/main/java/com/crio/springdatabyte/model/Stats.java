package com.crio.springdatabyte.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {

  public int numUsers;
  public int numPosts;

  @Override
  public String toString() {
    return "Stats{" +
        "numUsers=" + numUsers +
        ", numPosts=" + numPosts +
        '}';
  }

}
