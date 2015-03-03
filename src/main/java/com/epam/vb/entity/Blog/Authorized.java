package com.epam.vb.entity.Blog;

import javax.xml.crypto.Data;
import java.util.Comparator;
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

    protected Authorized(String email, String nickName) {
        this.email = email;
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }
}
