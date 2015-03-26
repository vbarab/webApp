package com.epam.vb.entity.Blog.parser;


import org.boon.Str;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
    private static final String TEXT_SOURCE = "The original and reference implementation Java compilers," + "\n" +
            " virtual machines, and class libraries were originally released by Sun under proprietary licences. " + "\n" +
            "As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. " + "\n" +
            "Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).";

    public static Text splitText() throws IOException {
        Text text = new Text();
        String[] splitedByParagraph = TextWorker.readFileToString("comments.txt").split("(?<=(\\r\\n){2}(?![\\r\\n]))");
        for (String paragraphString : splitedByParagraph){
            Paragraph paragraph = splitParagraph(paragraphString);
            text.addParagraph(paragraph);
        }
        return  text;
    }

    private static Paragraph splitParagraph(String paragraphString) {
        Paragraph paragraph = new Paragraph();
        String[] sentenceStrings = paragraphString.split("(?<=[.!?]\\s)(?!\\s)");
        for (String senteceString : sentenceStrings){
            Sentence sentence = parseSentence(senteceString);
        }
        return paragraph;
    }

    private static Sentence parseSentence(String senteceString) {
        Sentence sentence = new Sentence();
        String[] wordsStrings = senteceString.split("(?<=[\\s])");
        for (String String : wordsStrings ) {
            Word word = parseWord(wordsStrings);
        }
        return sentence;
    }

    private static Word parseWord(String[] wordsStrings) {
        Word word = new Word();

        StringBuilder builder = new StringBuilder();
        for(String s : wordsStrings) {
            builder.append(s);
        }
        String symbol = builder.toString();
   //     String[] symbStr = wordsStrings.toString().split("[[)][(],;:.!?\\s]+");
        String[] symbolString = symbol.split("[\\W]");
        for (String string : symbolString){
            Symbol symbol1 = parseSymbol(symbolString);
        }
        System.out.println(word.toString());
        return word;
    }

    private static Symbol parseSymbol(String[] symbolString) {
       Symbol symbol = new Symbol();
        for (int i = 0; i < symbolString.length; i++) {
       String[] symbolArray=  symbolString[i].split("[[)][(],;:.!?\\s]+");
            symbol.setSymbols(Arrays.asList(symbolArray));
        }
        return symbol;
        //
    }

    //

    /*
        public static void splitBySymbols() {
            Word word = new Word();
            String[] spitBySymbol = TEXT_SOURCE.split("[[)][(],;:.!?\\s]+");
            word.setWord(splitBySymbols);
            for (int i = 0; i < word.getWord().length; i++) {
                for (int j = 0; j < word.getWord()[i].length(); j++) {
                    char[] charsWord = word.getWord()[i].toCharArray();
                   */
/* System.out.println(charsWord[j]);*//*


            }
        }

    }

    public static void splitByWords() {
        Word word = new Word();
        String[] spitByWords = TEXT_SOURCE.split("[[)][(],;:.!?\\s]+");
        word.setWord(spitByWords);
       */
/* for (int i = 0; i < word.getWord().length; i++) {
            System.out.println(word.getWord()[i]);
        }*//*

    }

    public static void splitBySentence() {
        String[] splitBySentence = TEXT_SOURCE.split("[.!?]");
*/
/*        for (int i = 0; i < splitBySentence.length; i++) {
            System.out.println("new line:" + " " + splitBySentence[i]);
        }*//*

        Word word = new Word();
        word.setWord(splitBySentence);
        Sentence sentence = new Sentence();
        sentence.setSentence(new Word[]{word});
*/
    /*        for (int i = 0; i < sentence.getSentence().length; i++) {
            System.out.println(sentence.getSentence()[i]);

        }*//*

    }
*/

}
