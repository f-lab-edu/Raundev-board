package com.example.Rboard.service.impl;

import com.example.Rboard.domain.USERTYPE;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceImplTest {


    private Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired UserService userService;
    @Test
    void join() {
        User user = new User();
        user.setUserId("second");
        user.setUserName("A");
        user.setPassword("1234");
        user.setUserType(USERTYPE.USER);
        userService.join(user);
        logger.info(user.toString());
    }

}