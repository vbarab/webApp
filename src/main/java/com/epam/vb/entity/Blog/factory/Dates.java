package com.epam.vb.entity.Blog.factory;

import java.util.Date;

public class Dates {
    public static Date randomDateBetween(Date start,Date end){
        long delta = (long) (Math.random() *(end.getTime() - start.getTime()));
        return new Date(start.getTime() + delta);
    }
    public static Date randomDateForm(Date start){
        return randomDateBetween(start,new Date());
    }
}
