package com.example.Rboard.domain;

public enum USERTYPE {
    ADMIN("ADMIN"), USER("USER"), GUEST("GUEST");

    private final String TYPE;
    USERTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String TYPE(){
        return this.TYPE;
    }

}
