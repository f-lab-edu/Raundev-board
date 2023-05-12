package com.example.Rboard.controller;

import com.example.Rboard.domain.User;
import com.example.Rboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;  //userService
    private Logger logger = LoggerFactory.getLogger(UserService.class); //looger

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{userId}")
    public User findUser(@PathVariable String userId) {
        User user = userService.findUser(userId);
        return user;
    }
}
