package com.example.demo.usecases.repo_port;

import com.example.demo.domains.User;

public interface UserRepoPort {
    public User getUser(String name);
}
