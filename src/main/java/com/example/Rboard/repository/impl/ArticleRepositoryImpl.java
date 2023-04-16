package com.example.Rboard.repository.impl;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.ArticleRepository;

public class ArticleRepositoryImpl implements ArticleRepository {
    @Override
    public void create(Article article, User user) {

    }

    @Override
    public Article select(Long articleId) {
        return null;
    }

    @Override
    public Article update(Article article, User user) {
        return null;
    }

    @Override
    public boolean delete(Article article, User user) {
        return false;
    }
}
