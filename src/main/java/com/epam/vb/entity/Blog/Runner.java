package com.epam.vb.entity.Blog;


import com.epam.vb.entity.Blog.parser.Parser;
import com.epam.vb.entity.Blog.parser.TextWriter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
    static final String URL ="jdbc:h2:tcp://localhost:9092/~/testProjDataBase";
    static final String USER = "sa";
    static final String PASSWORD = "";
    public static void main(String[] args) throws IOException {

/*
        Parser fileWorker = new Parser();
         //fileWorker.splitBySymbols();
        fileWorker.splitBySentence();
*//*
        Blog blog = BlogFactory.create();
        String displayBlog = Boon.toPrettyJson(blog);
        System.out.println(displayBlog);
        System.out.println(blog.getTitle());
*//*
        TextReader textReader = new TextReader();
        textReader.reader("C:\\Users\\Ира\\AppData\\Local\\Temp\\test.txt");

        TextWriter textWriter = new TextWriter();
        textWriter.write("C:\\Users\\Ира\\AppData\\Local\\Temp\\write_test_file.txt");*/

        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
