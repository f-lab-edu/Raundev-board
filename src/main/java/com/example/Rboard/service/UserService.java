package com.example.Rboard.service;

import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void join(User user);

    User findUser(String id);

    List<User> findAllUsers();

    User updateUser(User user);

    boolean deleteUser(String deleteTargetUserId, User modiUser);
}
