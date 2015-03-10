package com.epam.vb.entity.Blog.model;


import java.util.UUID;

public class Comment extends Publication  {

    Post post;
    private String commentEmail;

    public Comment() {
    }

    public Comment(UUID uuid) {
        super(uuid);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getCommentEmail() {
        return commentEmail;
    }

    public void setCommentEmail(String commentEmail) {
        this.commentEmail = commentEmail;
    }
}
