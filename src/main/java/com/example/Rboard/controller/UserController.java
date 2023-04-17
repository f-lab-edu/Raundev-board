package com.example.Rboard.controller;

import com.example.Rboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping(value = "/users")*/
/*@Controller*/
@SpringBootApplication(scanBasePackages = {"com.example.Rboard"})
public class UserController {
    private final UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


}
