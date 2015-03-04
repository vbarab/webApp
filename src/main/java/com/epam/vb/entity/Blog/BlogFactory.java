package com.epam.vb.entity.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogFactory {


    public static Blog createPost(String name){
        Blog blog = new Blog();
        if (name.equals("Politics")) {
            blog.setTitle("Politics");
            blog.setDescription("What happen in USA");
            blog.setTag("Politics");
        }
return blog;
        }

    public static Blog create(){
        Blog blog = new Blog();
        PostFactory postFactory = new PostFactory();
        Post post = postFactory.createRandomPost();
        List<Post> postList = new ArrayList<Post>();
        postList.add(post);
        blog.setPosts(postList);//array
        blog.addPost(post);//object
        return blog;
    }

}
