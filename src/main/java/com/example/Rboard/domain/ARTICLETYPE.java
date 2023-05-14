package com.example.Rboard.domain;

public enum ARTICLETYPE {
    NOTIFICATION("NOTIFICATION"), PRIVATE("PRIVATE"), PUBLIC("PUBLIC");

    private final String TYPE;

    ARTICLETYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String TYPE(){
        return this.TYPE;
    }
}
