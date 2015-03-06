package com.epam.vb.entity.Blog.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.UUID;

public class Post implements Comparable<Post>{


    private String title;
    private String topic;
    private String authorName;
    private String text;
    private String description;
    private Date creationDate;
    private int likes;
    private UUID uuid;

    public Post() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", creationDate=" + creationDate +
                ", uuid=" + uuid +
                '}';
    }

    public Post(String title, String authorName, Date creationDate, UUID uuid) {
        this.title = title;
        this.authorName = authorName;
        this.creationDate = creationDate;
        this.uuid = uuid;
    }

    public static final Comparator<Post> LikesOrder = new LikesOreder();

    ArrayList topicArrays = new ArrayList();

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Post(String topic,int likes) {
        this.title = topic;
        this.likes = likes;
    }


    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Post post) {
        if (likes < post.getLikes()) return -1;
        if (likes > post.getLikes()) return 1;
        return 0;
    }

    public static class LikesOreder implements Comparator<Post> {

        @Override
        public int compare(Post o1, Post o2) {
            //return o1.getLikes() - o2.getLikes();
            return Integer.compare(o1.getLikes(),o2.getLikes());
        }
    }
}
