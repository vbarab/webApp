package com.epam.vb.entity.Blog;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment extends Post  {

    private String text;
    Date date ;

    public Comment(String text, Date date) {
        super();
        this.text = text;
        this.date = date;
    }



    public void setCurrentDate() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
        System.out.println(dateFormat.format(date));
    }

    @Override
    public int compareTo(Post post) {
        Comment comment = (Comment) post;
        return this.date.compareTo(comment.date);
    }

}
