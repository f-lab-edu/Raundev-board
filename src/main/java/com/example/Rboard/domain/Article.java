package com.example.Rboard.domain;

public class Article<T> {



    private Long articleId;
    private ARTICLETYPE type;
    private T articleContents;
    private User register;

    public Article(Long articleId, ARTICLETYPE type, T articleContents, User register) {
        this.articleId = articleId;
        this.type = type;
        this.articleContents = articleContents;
        this.register = register;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public ARTICLETYPE getType() {
        return type;
    }

    public void setType(ARTICLETYPE type) {
        this.type = type;
    }

    public T getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(T articleContents) {
        this.articleContents = articleContents;
    }

    public User getRegister() {
        return register;
    }

    public void setRegister(User register) {
        this.register = register;
    }
}
