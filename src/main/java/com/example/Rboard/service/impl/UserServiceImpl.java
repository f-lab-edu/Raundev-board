package com.example.Rboard.service.impl;

import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void join(User user) {
        userRepository.create(user);
    }

    @Override
    public User findUser(String id) {
        return userRepository.select(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.selectAll();
    }

    @Override
    public User updateUser(String userId) {
        return userRepository.update(userId);
    }

    @Override
    public boolean deleteUser(String deleteTargetUserId, User modiUser) {
        return userRepository.delete(deleteTargetUserId);
    }
}
