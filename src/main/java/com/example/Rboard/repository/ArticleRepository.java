package com.example.Rboard.repository;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;

public interface ArticleRepository {

    void create(Article article, User user);

    Article select(Long articleId);

    Article update(Article article, User user);

    boolean delete(Article article, User user);

}
