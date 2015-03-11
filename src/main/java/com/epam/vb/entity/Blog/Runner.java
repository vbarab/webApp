package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;
import org.boon.Boon;

public class Runner {
    public static void main(String[] args) {

        Blog blog = BlogFactory.create();
        String displayBlog = Boon.toPrettyJson(blog);
        System.out.println(displayBlog);
        System.out.println(blog.getTitle());

    }
}
