package com.eatgo.eatgo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
public class Restaurant {
  private String name;
  private String addr;

  public Restaurant(String name, String addr) {
    this.name = name;
    this.addr = addr;
  }

  public String getName() {
    return name;
  }

  public String getAddr(){
    return addr;
  }
}
