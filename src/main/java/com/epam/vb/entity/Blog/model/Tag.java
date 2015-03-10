package com.epam.vb.entity.Blog.model;

import java.util.List;
import java.util.UUID;

public class Tag extends BaseEntity{
    Blog blog;
    List<Post> postList;
    String title;

    public Tag() {
    }

    public Tag(UUID uuid) {
        super(uuid);
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
