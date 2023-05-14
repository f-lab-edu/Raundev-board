package com.example.Rboard.service;

import static org.assertj.core.api.Assertions.*;

import com.example.Rboard.domain.USERTYPE;
import com.example.Rboard.domain.User;
import com.example.Rboard.service.UserService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class UserServiceTest {

    UserService userService;

    @Autowired
    public UserServiceTest(UserService userService) {
        this.userService = userService;
    }

    @Test
    void findUser() {
        User user = new User("test1", "123456", USERTYPE.ADMIN, "첫번째");
        userService.createUser(user);

        User user1 = userService.findUser(user.getUserId());
        assertThat(user1.toString()).isEqualTo(user.toString());
    }

    @Test
    void findUsers() {

        User user1 = new User("test1", "123456", USERTYPE.ADMIN, "첫번째");
        User user2 = new User("test2", "123456", USERTYPE.USER, "둘둘둘");
        User user3 = new User("test3", "123456", USERTYPE.GUEST, "삼삼삼");
        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);

        List<User> allUsers = userService.findAllUsers();
        assertThat(allUsers).contains(user1, user2, user3);

    }

    @Test
    void updateUser() {

        User user1 = new User("test1", "123456", USERTYPE.ADMIN, "첫번째");
        userService.createUser(user1);
        User user2 = new User("test1", "abcdef", USERTYPE.GUEST, "두번째");

        userService.updateUser(user2);
        User user3 = userService.findUser(user1.getUserId());

        assertThat(user3.getUserId()).isEqualTo(user1.getUserId());
        assertThat(user3.getUserName()).isEqualTo(user2.getUserName());
        assertThat(user3.getUserType()).isEqualTo(user2.getUserType());
        assertThat(user3.getUserName()).isEqualTo(user2.getUserName());

    }

    @Test
    void deleteUser() {
        User user1 = new User("test1", "123456", USERTYPE.USER, "둘번째");
        User user2 = new User("test2", "123456", USERTYPE.ADMIN, "첫번째");
        userService.createUser(user1);
        userService.createUser(user2);

        assertThat(user1.toString()).isEqualTo(userService.findUser(user1.getUserId()).toString());
        userService.deleteUser(user1.getUserId(), user2);

        List<User> allUsers = userService.findAllUsers();
        assertThat(allUsers).doesNotContain(user1);
        assertThat(allUsers).contains(user2);
    }
}