package com.epam.vb.entity.Blog.parser;

import java.util.List;

public class Word {
    private static List<Symbol> word;

    public static List<Symbol> getWord() {
        return word;
    }

    public static void setWord(List<Symbol> word) {
        Word.word = word;
    }
}
