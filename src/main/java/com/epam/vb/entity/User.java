package com.epam.vb.entity;

public abstract class User {

    private int id;//TODO base Entity
    private String name;
    private String email;
    private String dataBirth;
    //TODO diffrent names (nick 1rs 2nd...)


    public User() {
    }

    //TODO remove constr ( beteer to set data )
    public User(int id, String name, String email, String dataBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dataBirth = dataBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(String dataBirth) {
        this.dataBirth = dataBirth;
    }
}
