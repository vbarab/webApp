package com.epam.vb.entity.Blog;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class PostFactory {
    private static final Random RANDOM = new Random();

    public static String stringGenerator(String characters, int length) {

        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(RANDOM.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static String nameCreator() {
        return stringGenerator("qwertyuiopsdfghjklzxcvbnm", 6);
    }

    private static String authorCreator() {
        return stringGenerator("wertyuioplkjhgfdsazxcvb", 8);
    }

    private static Date dateCreator() {
        return new Date(RANDOM.nextInt());
    }

    private static UUID uuidCreator() {
        return new UUID(RANDOM.nextInt(), RANDOM.nextInt());
    }

    public static Post createRandomPost() {
         String name = nameCreator();
         String author = authorCreator();
         Date date = dateCreator();
         UUID uuid = uuidCreator();
        return new Post(name, author, date, uuid);

    }

}
