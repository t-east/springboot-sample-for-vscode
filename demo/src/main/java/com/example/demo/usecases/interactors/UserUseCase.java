package com.example.demo.usecases.interactors;

import com.example.demo.domains.User;
import com.example.demo.usecases.repo_port.UserRepoPort;

public class UserUseCase {

  private UserRepoPort userRepo;

  public UserUseCase(UserRepoPort userRepo) {
    this.userRepo = userRepo;
  }

  public User create(String name) {
    return userRepo.getUser(name);
  }
}