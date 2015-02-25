package com.epam.vb.entity;

public class Admin extends User {

    private char password;


    public Admin(int id, String name, String email, String dataBirth, char password) {
        super(id, name, email, dataBirth);
        this.password = password;
    }
    public Post modifyPost(){
        return null;
    }
}
