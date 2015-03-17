package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.parser.FileWorker;
import com.epam.vb.entity.Blog.parser.TextReader;
import com.epam.vb.entity.Blog.parser.TextWriter;
import org.boon.Boon;
import org.boon.Str;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        FileWorker fileWorker = new FileWorker();
         //fileWorker.splitBySymbols();
        fileWorker.splitBySentence();
/*
        Blog blog = BlogFactory.create();
        String displayBlog = Boon.toPrettyJson(blog);
        System.out.println(displayBlog);
        System.out.println(blog.getTitle());
*/
        TextReader textReader = new TextReader();
        textReader.reader("C:\\Users\\Ира\\AppData\\Local\\Temp\\test.txt");

        TextWriter textWriter = new TextWriter();
        textWriter.write("C:\\Users\\Ира\\AppData\\Local\\Temp\\write_test_file.txt");


    }
}
