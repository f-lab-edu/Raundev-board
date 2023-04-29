package com.example.Rboard.repository;

import com.example.Rboard.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
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
