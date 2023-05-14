package com.example.Rboard.service;

import com.example.Rboard.domain.User;
import java.util.List;

public interface UserService {

    void createUser(User user);

    User findUser(String id);

    List<User> findAllUsers();

    Integer updateUser(User user);

    boolean deleteUser(String deleteTargetUserId, User modiUser);
}
