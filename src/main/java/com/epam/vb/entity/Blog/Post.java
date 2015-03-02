package com.epam.vb.entity.Blog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Post implements Comparable<Post>{

    //TODO COMPARATOR AND COMPARABLE
    private String title;
    private String topic;
    private String authorName;
    private String text;
    private String descritpion;
    private Date creationDate;
    private int likes;
    public static final Comparator<Post> LikesOrder = new LikesOreder();

    ArrayList topicArrays = new ArrayList();

    public Post(String topic,int likes) {
        this.title = topic;
        this.likes = likes;
    }

    public Post() {
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
