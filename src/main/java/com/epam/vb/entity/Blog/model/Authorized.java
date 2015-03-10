package com.epam.vb.entity.Blog.model;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.UUID;

public class Authorized extends User {

    private String lastName;
    private String email;
    private Date dataBirth;
    private Date dateRegistration;
    private String firstName;
    private char password;
    private String country;
    private String gender;

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public Authorized() {
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataBirth(Date dataBirth) {
        this.dataBirth = dataBirth;
    }


    public void setPassword(char password) {
        this.password = password;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
}
