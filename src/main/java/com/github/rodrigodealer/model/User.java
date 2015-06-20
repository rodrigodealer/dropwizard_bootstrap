package com.github.rodrigodealer.model;

import java.util.UUID;

/**
 * Created by rodrigo on 6/20/15.
 */
public class User {

    private String id = UUID.randomUUID().toString();

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
