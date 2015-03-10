package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Authorized;
import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.model.Post;
import com.epam.vb.entity.Blog.model.Tag;
import com.thedeanda.lorem.Lorem;

import java.util.*;

public class PostFactory {

    public static List<Post> createList(int amount, Blog blog, Authorized authorized, List<Tag> tags) {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            posts.add(create(blog, authorized, tags));
        }
        return posts;
    }

    public static Post create(Blog blog, Authorized authorized, List<Tag> tags) {
        Post post = new Post();
        post.setAuthorName(Lorem.getName());
        post.setTitle(Lorem.getTitle(7));
        post.setBodyText(Lorem.getWords(90));
        List<Tag> postTags = new ArrayList<>();
        for (Tag tag : tags) {
            if (Math.random() < 0.5) postTags.add(tag);
        }
        post.setTagList(postTags);
        post.setViews((int) Math.random() * 1000);
        post.setLike((int) Math.random() * 70);
        post.setDeleted(Math.random() > 5);
        return post;
    }


}
