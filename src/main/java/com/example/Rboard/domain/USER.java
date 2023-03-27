package com.example.Rboard.domain;

public abstract class USER {

    enum USERTYPE {
        ADMIN, USER, GUEST
    }
    USERTYPE TYPE;
    int id;
    int username;
    int password;

    public USER(USERTYPE TYPE, int id, int username, int password) {
        this.TYPE = TYPE;
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
