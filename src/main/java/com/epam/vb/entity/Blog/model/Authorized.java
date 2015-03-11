package com.epam.vb.entity.Blog.model;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.UUID;

public class Authorized extends BaseEntity {

    private String lastName;
    private String email;
    private Date dataBirth;
    private Date dateRegistration;
    private String firstName;
    private String gender;

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataBirth() {
        return dataBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public Authorized() {
    }

    public Date getDateRegistration() {
        return dateRegistration;
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


    public void setGender(String gender) {
        this.gender = gender;
    }
}
