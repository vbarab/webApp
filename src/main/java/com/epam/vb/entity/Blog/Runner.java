package com.epam.vb.entity.Blog;


public class Runner {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        BlogFactory blogFactory = new BlogFactory();
        System.out.println(postFactory.createRandomPost());
        System.out.println(blogFactory.createPoliticBlog());
        System.out.println(blogFactory.createBlog());
    }
}
