package com.example.Rboard.repository;

import com.example.Rboard.domain.User;

public interface UserRepository {

    void create(User user);

    User select(String id);

    User update(User user);

    boolean delete(String deleteTargetUserId, User modiUser);

}
