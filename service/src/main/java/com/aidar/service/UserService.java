package com.aidar.service;

import com.aidar.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getCurrent();

    User getOne(Long id);

    void add(User user);

    void update(User user);

    void ban(String email);

    void pardon(String email);

}
