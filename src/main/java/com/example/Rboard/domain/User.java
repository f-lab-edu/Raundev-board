package com.example.Rboard.domain;

public class User {

    private USERTYPE TYPE;
    private String id;
    private int username;
    private int password;

    public User(USERTYPE TYPE, String id, int username, int password) {
        this.TYPE = TYPE;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public USERTYPE getTYPE() {
        return TYPE;
    }

    public String getId() {
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

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
