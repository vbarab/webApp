package com.epam.vb.entity.Blog.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
    private File filename;
    public void write(String filename) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename,true));
        StringBuilder stringBuilder = new StringBuilder();
        try {
            bufferedWriter.write("Add this line to text document");
            bufferedWriter.newLine();
            bufferedWriter.write("Another line to add here");
           bufferedWriter.append("\nCopywriter parse ");
        }
        finally {
          //  bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
