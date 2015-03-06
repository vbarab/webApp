package com.epam.vb.entity.Blog.model;

public class Admin extends Authorized implements Comparable<Admin> {

    protected Admin(String email, String nickName) {
        super(email, nickName);
    }


    public Post modifyPost(){
        return null;
    }
    public Comment modifyComment(){
        return null;
    }

    @Override
    public int compareTo(Admin admin) {
        if (this.getNickName().equals(admin.getNickName()))return this.getNickName().compareTo(admin.getNickName());
        return 0;
    }
}
