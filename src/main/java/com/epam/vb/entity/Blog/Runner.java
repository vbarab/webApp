package com.epam.vb.entity.Blog;


public class Runner {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        System.out.println(postFactory.createRandomPost());

    }
}
