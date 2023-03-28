package com.example.Rboard.domain;

public class User {

    enum USERTYPE {
        ADMIN, USER, GUEST
    }
    USERTYPE TYPE;
    int id;
    int username;
    int password;

    public User(USERTYPE TYPE, int id, int username, int password) {
        this.TYPE = TYPE;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public USERTYPE getTYPE() {
        return TYPE;
    }

    public int getId() {
        return id;
    }

    public int getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }
}
