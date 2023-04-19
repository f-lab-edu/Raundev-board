package com.example.Rboard;


import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.UserService;
import com.example.Rboard.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private final UserRepository userRepository;

    public AppConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl(userRepository);
    }


}
