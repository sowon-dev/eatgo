package com.eatgo.eatgo.inferfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

  @GetMapping("/")
  public String hello(){
    return "안녕~";
  }
}
