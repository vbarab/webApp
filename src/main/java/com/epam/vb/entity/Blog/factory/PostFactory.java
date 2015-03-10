package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Authorized;
import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.model.Post;
import com.epam.vb.entity.Blog.model.Tag;
import com.thedeanda.lorem.Lorem;
import javafx.geometry.Pos;

import javax.swing.text.html.HTML;
import java.util.*;

public class PostFactory {
    private static final Random RANDOM = new Random();

    public static List<Post> createList(int amount, Blog blog, Authorized authorized, List<Tag> tags) {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            posts.add(create(blog, authorized, tags));
        }
        return posts;
    }

    public static Post create(Blog blog, Authorized authorized, List<Tag> tags) {
        Post post = new Post();
        post.setAuthorName(Lorem.getName());
        post.setTitle(Lorem.getTitle(7));
        post.setBodyText(Lorem.getWords(90));
        List<Tag> postTags = new ArrayList<>();
        for (Tag tag : tags) {
            if (Math.random() < 0.5) postTags.add(tag);
        }
        post.setTagList(postTags);
        post.setViews((int) Math.random() * 1000);
        post.setLike((int) Math.random() * 70);
        post.setDeleted(Math.random() > 5);
        return post;
    }

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

/*    public static Post createRandomPost() {
         String name = nameCreator();
         String author = authorCreator();
         Date date = dateCreator();
         UUID uuid = uuidCreator();
        return new Post(name, author, date, uuid);

    }*/

}
