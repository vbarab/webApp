package com.epam.vb.entity.Blog.parser;

import org.boon.Str;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextWorker {
    public static String readFileToString(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        try {
                    String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
        } finally {
            bufferedReader.close();
        }

        String everything = stringBuilder.toString();
        return everything;

    }
}
