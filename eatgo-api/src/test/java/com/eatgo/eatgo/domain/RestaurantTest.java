package com.eatgo.eatgo.domain;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RestaurantTest {
  @Test
  public void creation(){
    Restaurant restaurant = new Restaurant("식당이름", "");
    assertThat(restaurant.getName(), is("식당이름"));
  }

  @Test
  public void 지역(){
    Restaurant restaurant = new Restaurant("맛집", "부산");
    assertThat(restaurant.getAddr(), is("부산"));
  }
}