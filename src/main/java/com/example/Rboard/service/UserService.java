package com.example.Rboard.service;

import com.example.Rboard.domain.User;

public interface UserService {

    void join(User user);

    User findUser(String id);

    User updateUser(User user);

    boolean deleteUser(String deleteTargetUserId, User modiUser);
}
