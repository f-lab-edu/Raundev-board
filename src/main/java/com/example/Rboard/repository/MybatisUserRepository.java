package com.example.Rboard.repository;

import com.example.Rboard.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MybatisUserRepository extends UserRepository{

    @Override
    void create(User user);

    @Override
    User select(String id);

    @Override
    List<User> selectAll();

    @Override
    User update(String id);

    @Override
    boolean delete(String deleteTargetUserId);
}
