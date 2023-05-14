package com.example.Rboard.service.impl;

import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
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
    public Integer updateUser(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean deleteUser(String deleteTargetUserId, User modiUser) {
        return userRepository.delete(deleteTargetUserId);
    }
}
