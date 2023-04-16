package com.example.Rboard.domain;

public class Article {



    private Long articleId;
    private ARTICLETYPE articleType;
    private String articleTitle;
    private String articleContents;
    private String registerId;

    public Article(Long articleId, ARTICLETYPE articleType, String articleContents, String registerId) {
        this.articleId = articleId;
        this.articleType = articleType;
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
}
