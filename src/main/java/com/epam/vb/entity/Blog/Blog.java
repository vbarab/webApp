package com.epam.vb.entity.Blog;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {

   private String title;
   private String description;
   private String tag;
    private Date date;
    private List<Post> postList;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Blog() {
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
        if (post==null) postList = new ArrayList<Post>();
        postList.add(post);
    }
}
