package com.example.spring_boot.dao;

import com.example.spring_boot.model.User;
import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
