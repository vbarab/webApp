package com.epam.vb.entity.Blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {

    private String title;
    private String description;
    private String tag;
    private Date date;
    private List<Post> postList;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", date=" + date +
                ", postList=" + postList +
                ", author='" + author + '\'' +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    public void setPosts(List<Post> posts) {
        postList = posts;
    }

    public void addPost(Post post) {
        if (post == null) return;
        if (postList == null) postList = new ArrayList<Post>();
        postList.add(post);
    }
}
