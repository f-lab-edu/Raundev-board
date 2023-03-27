package com.example.Rboard.domain;

import org.apache.catalina.User;

public interface Board {

    void write(User user);
    void delete(User user, Article article);
    Article read(User user, Article article);

}
