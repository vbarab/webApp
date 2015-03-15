package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.parser.FileWorker;
import org.boon.Boon;
import org.boon.Str;

public class Runner {
    public static void main(String[] args) {

        FileWorker fileWorker = new FileWorker();
         //fileWorker.splitBySymbols();
        fileWorker.splitBySentence();
/*
        Blog blog = BlogFactory.create();
        String displayBlog = Boon.toPrettyJson(blog);
        System.out.println(displayBlog);
        System.out.println(blog.getTitle());
*/

    }
}
