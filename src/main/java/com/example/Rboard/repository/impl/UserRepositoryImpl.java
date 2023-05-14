package com.example.Rboard.repository.impl;

import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;

import java.util.List;


public class UserRepositoryImpl implements UserRepository {

    @Override
    public void create(User user) {

    }

    @Override
    public User select(String id) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public int update(User user) {
        return 1;
    }

    @Override
    public boolean delete(String deleteTargetUserId) {
        return false;
    }
}
