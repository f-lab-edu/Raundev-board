package com.example.Rboard.domain;

public abstract class Article {

    private int boardId;

    public Article(int boardId) {
        this.boardId = boardId;
    }

    abstract Article modify();
}
