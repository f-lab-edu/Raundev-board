package com.example.Rboard.repository.impl;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.ArticleRepository;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository {

    @Override
    public void create(Article article, String registerId) {}

    @Override
    public Article select(Long articleId) {
        return null;
    }

    @Override
    public List<Article> selectAll(String userId) {
        return null;
    }

    @Override
    public Integer update(Article article, String registerId) {
        return null;
    }

    @Override
    public boolean delete(Article article) {
        return false;
    }
}
