package com.epam.vb.entity.Blog.parser;

import java.util.List;

public class Symbol {
    private static List<Character> symbols;

    public static List<Character> getSymbols() {
        return symbols;
    }

    public static void setSymbols(List<Character> symbols) {
        Symbol.symbols = symbols;
    }
}

