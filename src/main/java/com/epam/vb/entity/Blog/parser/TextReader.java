package com.epam.vb.entity.Blog.parser;

import java.io.*;

public class TextReader {
  public void reader(String filename) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
      StringBuilder stringBuilder = new StringBuilder();
      try {
          File file = new File(filename);

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
      System.out.println(everything);
  }
}
