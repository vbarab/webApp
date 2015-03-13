package com.epam.vb.entity.Blog.factory;

import com.epam.vb.entity.Blog.model.Authorized;
import com.epam.vb.entity.Blog.model.Comment;
import com.epam.vb.entity.Blog.model.Post;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;

public class CommentFactory {

    private static Comment create(Authorized authorized,Post post){
        Comment comment = new Comment();
        if (Math.random() < 0.2) comment.setAuthor(authorized);
        else comment.setAuthor(AuthorizedUserFactory.create());
        comment.setBodyText(Lorem.getWords(15));
        comment.setTitle(Lorem.getTitle(4));
        comment.setCreationDate(Dates.randomDateForm(post.getCreationDate()));
        comment.setLike((int) (Math.random()* 20));
        comment.setDeleted(Math.random()<0.3);
        return comment;
    }
    public static List<Comment> createList(int amount,Authorized authorized, Post post){
        List<Comment> comments = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            comments.add(create(authorized,post));
        }
        return comments;
    }
}
