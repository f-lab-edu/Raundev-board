package com.example.Rboard.controller;

import com.example.Rboard.domain.User;
import com.example.Rboard.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


    /**
     * 사용자 단건 조회
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public User findUser(@PathVariable String userId) {
        User user = userService.findUser(userId);
        return user;
    }

    /**
     * 사용자 다건 조회
     * @return
     */
    @GetMapping
    public List<User> findUsers() {
        List<User> users = userService.findAllUsers();
        return users;
    }

    /**
     * 사용자 정보 업데이트
     * @param user: 업데이트할 사용자 정보
     * @return
     */
    @PostMapping("/update")
    public Integer updateUser(@ModelAttribute User user) {
        return userService.updateUser(user);
    }

    /**
     * 사용자 신규 생성
     * @param user: 가입할 사용자 정보
     */
    @PostMapping("/create")
    public void createUser(@ModelAttribute User user) {
        userService.createUser(user);
    }

    /**
     * 사용자 탈퇴
     * @param modifiedUserId: 수정자 아이디
     * @param deleteTargetUserID: 삭제할 아이디
     */
    @PostMapping("/delete/{modifiedUserId}/{deleteTargetUserID}")
    public void deleteUser(@PathVariable String modifiedUserId, @PathVariable String deleteTargetUserID ) {
        User modiUser = userService.findUser(modifiedUserId);
        userService.deleteUser(deleteTargetUserID, modiUser);
    }
}
