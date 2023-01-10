package com.example.demo.interfaces;

import com.example.demo.domains.User;
import com.example.demo.usecases.repo_port.UserRepoPort;

public class UserRepo implements UserRepoPort {
    public User getUser(String name) {
        return new User(name);
    };
}
