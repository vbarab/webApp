package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.model.Post;

import java.util.*;

public class BlogFactory {
    private static final Random RANDOM = new Random();

    public static Blog createPoliticBlog() {
        Blog blog = new Blog();
        blog.setTitle("Politics");
        blog.setDescription("What happen in USA");
        blog.setTag("Politics");

        return blog;
    }

    public static String stringGenerator(String characters, int length) {

        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(RANDOM.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static String titleCreator() {
        return stringGenerator("qwertyuiopsdfghjklzxcvbnm", 6);
    }

    public static String tagCreator() {
        return stringGenerator("qwertyuiopsdfghjklzxcvbnm", 6);
    }

    private static String descriptonCreator() {
        return stringGenerator("wertyuioplkjhgfdsazxcvb", 8);
    }

    private static Date dateCreator() {
        return new Date(RANDOM.nextInt());
    }


    public static Blog createBlog() {
        Blog blog = new Blog();
        PostFactory postFactory = new PostFactory();
        Post post = postFactory.createRandomPost();
        blog.setDate(dateCreator());
        blog.setTag(tagCreator());
        blog.setTitle(titleCreator());
        blog.setDescription(descriptonCreator());
        List<Post> postList = new ArrayList<Post>();
        postList.add(post);
        blog.setPosts(postList);//array
        blog.addPost(post);//object
        return blog;

    }

}
