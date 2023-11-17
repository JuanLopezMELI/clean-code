package org.example.utils;

public class UserRepository {
  public User findUser(String username) {
    return new User().setUsername("username").setPassword("password");
  }
}
