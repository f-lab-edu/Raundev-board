package com.example.Rboard.repository.impl;

import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {


    @Override
    public void create(User user) {

    }

    @Override
    public User select(String id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(String deleteTargetUserId) {
        return false;
    }
}
