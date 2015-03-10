package com.epam.vb.entity.Blog.model;

import java.util.*;

public class Post extends Publication {

    ArrayList topicArrays = new ArrayList();
    private String title;
    private String topic;
    private String description;
    private List<Tag> tagList;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public ArrayList getTopicArrays() {
        return topicArrays;
    }

    public void setTopicArrays(ArrayList topicArrays) {
        this.topicArrays = topicArrays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}
