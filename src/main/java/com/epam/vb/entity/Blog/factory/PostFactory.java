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
        int randomNumber = (int) (Math.random() * 10);
        post.setAuthor(authorized);
        post.setTitle(Lorem.getTitle(7));
        post.setBodyText(Lorem.getWords(90));
        post.setDescription(Lorem.getWords(10,60));
        List<Tag> postTags = new ArrayList<>();
        for (Tag tag : tags) {
            if (Math.random() < 0.5) postTags.add(tag);
        }
        post.setTagList(postTags);

        post.setViews(randomNumber * 70);
        post.setLike(randomNumber * 13);
        post.setDeleted(Math.random() > 0.5);
        return post;
    }


}
