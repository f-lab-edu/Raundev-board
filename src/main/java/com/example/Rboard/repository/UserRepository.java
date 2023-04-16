package com.example.Rboard.repository;

import com.example.Rboard.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    void create(User user);

    User select(String id);

    User update(User user);

    boolean delete(String deleteTargetUserId);

}
