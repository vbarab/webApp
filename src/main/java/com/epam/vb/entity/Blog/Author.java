package com.epam.vb.entity.Blog;

public class Author extends User {

    private char password;

    public Author(int id, String name, String email, String dataBirth, char password) {
        super(id, name, email, dataBirth);
        this.password = password;
    }
    public Post createPost(){
        return null;
    }
}
