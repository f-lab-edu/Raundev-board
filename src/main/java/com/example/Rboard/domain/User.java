package com.example.Rboard.domain;

public class User {

    private String userId;
    private String password;
    private USERTYPE userType;
    private String userName;

    public User(String userId, String password, USERTYPE userType, String userName) {
        this.userId = userId;
        this.password = password;
        this.userType = userType;
        this.userName = userName;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public USERTYPE getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(USERTYPE userType) {
        this.userType = userType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "User [ID : "+ this.userId+" NAME : "+this.userName+" TYPE : " + this.userType + " PASSWORD : " + this.password + " ]" ;
    }
}
