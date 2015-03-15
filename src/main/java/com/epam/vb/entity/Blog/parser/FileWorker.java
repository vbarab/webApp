package com.epam.vb.entity.Blog.parser;


public class FileWorker {
    private static final String TEXT_SOURCE = "The original and reference implementation Java compilers," + "\n" +
            " virtual machines, and class libraries were originally released by Sun under proprietary licences. " + "\n" +
            "As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. " + "\n" +
            "Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).";

    public static void splitByWords() {
        Word word = new Word();
        String[] spitByWords = TEXT_SOURCE.split("[[)][(],;:.!?\\s]+");
        word.setWord(spitByWords);
       /* for (int i = 0; i < word.getWord().length; i++) {
            System.out.println(word.getWord()[i]);
        }*/
    }

    public static void splitBySymbols() {

        Word word = new Word();
        String[] spitByWords = TEXT_SOURCE.split("[[)][(],;:.!?\\s]+");
        word.setWord(spitByWords);
        for (int i = 0; i < word.getWord().length; i++) {
            for (int j = 0; j < word.getWord()[i].length(); j++) {
                char[] charsWord = word.getWord()[i].toCharArray();
               /* System.out.println(charsWord[j]);*/

            }
        }

    }
    public static void splitBySentence(){
        String[] splitBySentence = TEXT_SOURCE.split("(\\. )");
/*        for (int i = 0; i < splitBySentence.length; i++) {
            System.out.println("new line:" + " " + splitBySentence[i]);
        }*/
        Word word = new Word();
        word.setWord(splitBySentence);
        Sentence sentence = new Sentence();
        sentence.setSentence(new Word[]{word});
/*        for (int i = 0; i < sentence.getSentence().length; i++) {
            System.out.println(sentence.getSentence()[i]);
        }*/

    }


}
