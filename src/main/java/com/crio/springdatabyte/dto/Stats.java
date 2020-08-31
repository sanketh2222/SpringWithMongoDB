package com.crio.springdatabyte.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {

  public int numUsers;

  @Override
  public String toString() {
    return "Stats{" +
        "numUsers=" + numUsers +
        '}';
  }

}
