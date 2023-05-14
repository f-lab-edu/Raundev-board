package com.example.Rboard.domain;

import java.util.Objects;

public class Article {



    private Long articleId;
    private ARTICLETYPE articleType;
    private String articleTitle;
    private String articleContents;
    private String registerId;

    public Article(ARTICLETYPE articleType, String articleTitle, String articleContents,
            String registerId) {
        this.articleType = articleType;
        this.articleTitle = articleTitle;
        this.articleContents = articleContents;
        this.registerId = registerId;
    }

    public Article(Long articleId, ARTICLETYPE articleType, String articleTitle,
            String articleContents,
            String registerId) {
        this.articleId = articleId;
        this.articleType = articleType;
        this.articleTitle = articleTitle;
        this.articleContents = articleContents;
        this.registerId = registerId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public ARTICLETYPE getArticleType() {
        return articleType;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleContents() {
        return articleContents;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setArticleType(ARTICLETYPE articleType) {
        this.articleType = articleType;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Article article = (Article) o;
        return Objects.equals(articleId, article.articleId)
                && articleType == article.articleType && Objects.equals(articleTitle,
                article.articleTitle) && Objects.equals(articleContents,
                article.articleContents) && Objects.equals(registerId, article.registerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, articleType, articleTitle, articleContents, registerId);
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleType=" + articleType +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContents='" + articleContents + '\'' +
                ", registerId='" + registerId + '\'' +
                '}';
    }
}
