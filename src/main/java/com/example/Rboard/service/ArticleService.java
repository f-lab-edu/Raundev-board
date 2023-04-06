package com.example.Rboard.service;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;

public interface ArticleService {

    void createArticle(Article article, User user);

    Article selectArticle(Long articleId);

    Article updateArticle(Article article, User user);

    boolean deleteArticle(Article article, User user);
}
