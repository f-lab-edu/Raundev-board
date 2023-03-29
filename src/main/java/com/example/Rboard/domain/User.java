package com.example.Rboard.domain;

public class User {

    enum USERTYPE {
        ADMIN, USER, GUEST
    }
    USERTYPE TYPE;
    int id;
    int username;
    int password;

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

    public void setTYPE(USERTYPE TYPE) {
        this.TYPE = TYPE;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
