package com.epam.vb.entity.Blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {

    private String title;
    private String description;
    private List<Tag> tag;
    private Date creationDate;
    private List<Post> postList;
    private Authorized author;

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setAuthor(Authorized author) {
        this.author = author;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public Blog() {
    }

    public List<Tag> getTag() {
        return tag;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Authorized getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }


    public void addPost(Post post) {
        if (post == null) return;
        if (postList == null) postList = new ArrayList<Post>();
        postList.add(post);
    }
}
