package com.epam.vb.entity.Blog.factory;

public class Gender {
    public static String gender(){
        long delta = (long) (Math.random()*10);
        if (delta<5) return "male";
        else return "female";
    }
}
