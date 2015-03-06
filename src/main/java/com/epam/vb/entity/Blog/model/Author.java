package com.epam.vb.entity.Blog.model;

import java.util.Comparator;

public class Author extends Authorized {

    public Author(String email, String nickName) {
        super(email,nickName);
    }

    public static class NickToEmailComparator implements Comparator<Author> {

        @Override
        public int compare(Author o1, Author o2) {
            String firstNick = o1.getNickName().toUpperCase();
            String secondNick = o2.getNickName().toUpperCase();
            String firstEmail = o1.getEmail();
            String secondEmail = o2.getEmail();

            int resultNick = firstNick.compareTo(secondNick);
            //int resultEmail = firstEmail.compareTo(secondEmail);
            return resultNick;
        }
    }
    public Post createPost(){
        return null;
    }
    public Post modifyPost(){
        return null;
    }
    public void deletePost(){}
}
