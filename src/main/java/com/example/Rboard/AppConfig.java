package com.example.Rboard;


import com.example.Rboard.repository.ArticleRepository;
import com.example.Rboard.repository.UserRepository;
import com.example.Rboard.service.ArticleService;
import com.example.Rboard.service.UserService;
import com.example.Rboard.service.impl.ArticleServiceImpl;
import com.example.Rboard.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

@Configuration
public class AppConfig {

    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;
    public AppConfig(UserRepository userRepository , ArticleRepository articleRepository) {
        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl(userRepository);
    }

    @Bean
    public ArticleService articleService() {
        return new ArticleServiceImpl(articleRepository);
    }



}
