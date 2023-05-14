package com.example.Rboard.service;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.Rboard.domain.ARTICLETYPE;
import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.USERTYPE;
import com.example.Rboard.domain.User;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class ArticleServiceTest {

    UserService userService;
    ArticleService articleService;

    @Autowired
    public ArticleServiceTest(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    @Test
    void articleTest(){

        User user = new User("test1", "123456", USERTYPE.ADMIN, "테스트");
        userService.createUser(user);

        Article article = new Article(ARTICLETYPE.PUBLIC, "제목1", "내용1", user.getUserId());
        articleService.createArticle(article, user);

        List<Article> articles = articleService.selectAllArticle(user);

        for (Article article1 : articles) {
            assertThat(articleService.selectArticle(article1.getArticleId()).getArticleTitle()).isEqualTo(article.getArticleTitle());
            assertThat(articleService.selectArticle(article1.getArticleId()).getArticleContents()).isEqualTo(article.getArticleContents());
            assertThat(articleService.selectArticle(article1.getArticleId()).getArticleType()).isEqualTo(article.getArticleType());

            article1.setArticleTitle("제목2");
            article1.setArticleContents("내용2");
            articleService.updateArticle(article1, user);
            assertThat(articleService.selectArticle(article1.getArticleId()).getArticleTitle()).isEqualTo("제목2");
            assertThat(articleService.selectArticle(article1.getArticleId()).getArticleContents()).isEqualTo("내용2");

            articleService.deleteArticle(article1, user);
            assertThat(articleService.selectAllArticle().size()).isEqualTo(0);
        }

    }





}