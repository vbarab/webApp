package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;

public class Runner {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        BlogFactory blogFactory = new BlogFactory();
      //  System.out.println(postFactory.createRandomPost());
       // System.out.println(blogFactory.createPoliticBlog());
       // System.out.println(blogFactory.createBlog());
        Blog blog = new Blog();
        System.out.println(blog.getPostList());
    }
}
