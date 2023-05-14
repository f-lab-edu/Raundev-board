package com.example.Rboard.repository;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper //XML파일 도는 어노테이션에 기재된 SQL 쿼리 명령을 수행할 수 있게 하는 어노테이션, 해당 인터페이스를 MyBais mapper 빈으로 등록해줌
@Component
public interface MybatisArticleRepository extends ArticleRepository{

    @Override
    void create(Article article, String registerId);

    @Override
    Article select(Long articleId);

    @Override
    List<Article> selectAll(String userId);

    @Override
    Integer update(Article article, String registerId);

    @Override
    boolean delete(Article article);
}
