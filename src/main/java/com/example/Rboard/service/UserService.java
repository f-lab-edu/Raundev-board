package com.example.Rboard.service;

import com.example.Rboard.domain.User;
import java.util.List;

public interface UserService {

    void join(User user);

    User findUser(String id);

    List<User> findAllUsers();

    User updateUser(String userId);

    boolean deleteUser(String deleteTargetUserId, User modiUser);
}
