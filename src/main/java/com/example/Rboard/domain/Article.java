package com.example.Rboard.domain;

public class Article<T> {

    enum ARTICLE_TYPE {
        NOTI, PRIVATE, PUBLIC
    }

    private int articleId;
    ARTICLE_TYPE type;
    private T articleContents;
    private User register;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public ARTICLE_TYPE getType() {
        return type;
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

}
