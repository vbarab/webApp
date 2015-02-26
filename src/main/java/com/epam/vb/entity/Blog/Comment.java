package com.epam.vb.entity.Blog;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment extends Post {

    private String text;
    Date date = new Date();

    public void setCommentDate() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
        System.out.println(dateFormat.format(date));
    }
}
