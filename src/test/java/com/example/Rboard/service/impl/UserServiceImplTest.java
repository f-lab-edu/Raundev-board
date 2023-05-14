package com.example.Rboard.service.impl;

import com.example.Rboard.AppConfig;
import com.example.Rboard.domain.USERTYPE;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


/*@SpringBootTest*/
class UserServiceImplTest {


    private Logger logger = LoggerFactory.getLogger(UserService.class);

    ApplicationContext ac = new
            AnnotationConfigApplicationContext(AppConfig.class);
    UserService userService;

    @BeforeEach
    void beforeEach(){
        userService = ac.getBean("userService", UserService.class);
    }


    @Test
    void join() {
        User user = new User();
        user.setUserId("second");
        user.setUserName("A");
        user.setPassword("1234");
        user.setUserType(USERTYPE.USER);
        userService.createUser(user);
        logger.info(user.toString());
    }


}