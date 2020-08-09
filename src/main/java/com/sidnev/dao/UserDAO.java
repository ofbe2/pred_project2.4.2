package com.sidnev.dao;

import com.sidnev.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    User findByName(String name);
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
}
