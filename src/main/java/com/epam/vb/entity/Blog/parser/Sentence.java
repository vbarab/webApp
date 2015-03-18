package com.epam.vb.entity.Blog.parser;

import java.util.List;

public class Sentence {
    private static List<Word>  sentence;

    public static List<Word> getSentence() {
        return sentence;
    }

    public static void setSentence(List<Word> sentence) {
        Sentence.sentence = sentence;
    }
}
