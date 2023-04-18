package com.example.Rboard.repository;

import com.example.Rboard.domain.User;
import java.util.List;

public interface UserRepository {

    void create(User user);

    User select(String id);

    List<User> selectAll();

    User update(String id);

    boolean delete(String deleteTargetUserId);

}
