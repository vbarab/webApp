package com.epam.vb.entity.Blog.factory;


import com.epam.vb.entity.Blog.model.Authorized;
import com.epam.vb.entity.Blog.model.Blog;

import com.thedeanda.lorem.Lorem;

import java.util.*;

public class BlogFactory {


    public static Blog create(){
        Blog blog = new Blog();
        Authorized authorized = AuthorizedUserFactory.create();
        blog.setAuthor(authorized);
        blog.setCreationDate(Dates.randomDateBetween(authorized.getDateRegistration(),new Date()));
        blog.setTitle(Lorem.getTitle(5));
        blog.setDescription(Lorem.getWords(12));
        blog.setTag(TagFactory.createList(5));
        blog.setPostList(PostFactory.createList(20,blog,authorized,blog.getTag()));
        return blog;
    }

}
