package com.epam.vb.entity.Blog.model;

import javax.xml.crypto.Data;
import java.util.UUID;

public abstract class Authorized extends User {

    private String secondName;
    private String email;
    private Data dataBirth;
    private String nickName;
    private char password;
    private UUID id; /* = UUID.randomUUID();*/
    private String country;
    private String city;
    private String about;
    private String gender;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Authorized(String email, String nickName) {
    }
}
