package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Tag;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;

public class TagFactory {

    public static List<Tag> createList(int amount){
        ArrayList<Tag> tags = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            tags.add(createTag());
        }
        return tags;
    }

    private static Tag createTag() {
        Tag tag = new Tag();
        tag.setTitle(Lorem.getWords(1));
        return tag;
    }
}
