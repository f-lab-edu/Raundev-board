package com.example.Rboard.service.impl;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.ArticleRepository;
import com.example.Rboard.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void createArticle(Article article, User user) {
        articleRepository.create(article, user);
    }

    @Override
    public Article selectArticle(Long articleId) {
        return articleRepository.select(articleId);
    }

    @Override
    public Article updateArticle(Article article, User user) {
        return articleRepository.update(article, user);
    }

    @Override
    public boolean deleteArticle(Article article, User user) {
        return articleRepository.delete(article, user);
    }
}
