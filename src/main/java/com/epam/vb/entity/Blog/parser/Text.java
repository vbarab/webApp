package com.epam.vb.entity.Blog.parser;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private static List<Paragraph> paragraphs = new ArrayList<>();

    public static List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void addParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);
    }

    public static void setParagraphs(List<Paragraph> paragraphs) {
        Text.paragraphs = paragraphs;
    }
}
