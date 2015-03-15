package com.epam.vb.entity.Blog.parser;

public class Sentence {
    private static Word[] sentence;

    public static Word[] getSentence() {
        return sentence;
    }

    public static void setSentence(Word[] sentence) {
        Sentence.sentence = sentence;
    }


}
