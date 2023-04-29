package com.example.Rboard.repository;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MybatisArticleRepository extends ArticleRepository{

    @Override
    void create(Article article, User user);

    @Override
    Article select(Long articleId);

    @Override
    Article update(Article article, User user);

    @Override
    boolean delete(Article article, User user);
}
