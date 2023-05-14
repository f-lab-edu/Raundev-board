package com.example.Rboard.service;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import java.util.List;

public interface ArticleService {

    void createArticle(Article article, User user);

    Article selectArticle(Long articleId);

    List<Article> selectAllArticle(User user);
    List<Article> selectAllArticle();

    Integer updateArticle(Article article, User user);

    boolean deleteArticle(Article article, User user);
}
