package com.example.Rboard.service.impl;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import com.example.Rboard.repository.ArticleRepository;
import com.example.Rboard.service.ArticleService;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void createArticle(Article article, User user) {
        articleRepository.create(article, user.getUserId());
    }

    @Override
    public Article selectArticle(Long articleId) {
        return articleRepository.select(articleId);
    }

    @Override
    public List<Article> selectAllArticle(User user) {
        return articleRepository.selectAll(user.getUserId());
    }

    @Override
    public List<Article> selectAllArticle() {
        return articleRepository.selectAll(null);
    }


    @Override
    public Integer updateArticle(Article article, User user) {
        return articleRepository.update(article, user.getUserId());
    }

    @Override
    public boolean deleteArticle(Article article, User user) {
        return articleRepository.delete(article);
    }
}
