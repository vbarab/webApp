package com.epam.vb.entity.Blog.parser;

import java.util.List;

public class Symbol {
    private static List<String> symbols;

    public static List<String> getSymbols() {
        return symbols;
    }

    public static void setSymbols(List<String> symbols) {
        Symbol.symbols = symbols;
    }
}

