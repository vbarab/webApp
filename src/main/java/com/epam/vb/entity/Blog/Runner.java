package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;
import org.boon.Boon;

public class Runner {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        BlogFactory blogFactory = new BlogFactory();
      //  System.out.println(postFactory.createRandomPost());
       // System.out.println(blogFactory.createPoliticBlog());
       // System.out.println(blogFactory.createBlog());
       Blog blog = BlogFactory.create();
        System.out.println(blog);
        String displayBlog = Boon.toPrettyJson(blog);
        System.out.println(displayBlog);

      //  System.out.println(blog.getPostList());

    }
}
