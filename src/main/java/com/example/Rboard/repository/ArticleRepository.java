package com.example.Rboard.repository;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import java.util.List;

public interface ArticleRepository {

    void create(Article article, String registerId);

    Article select(Long articleId);

    List<Article> selectAll(String registerId);

    Integer update(Article article, String registerId);

    boolean delete(Article article);

}
