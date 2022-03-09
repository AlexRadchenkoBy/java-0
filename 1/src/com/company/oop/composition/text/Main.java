package com.company.oop.composition.text;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    chekText();
    }

    public static void chekText() {

        Word word1 = new Word("Мы");
        Word word2 = new Word("учимся");
        Word word3 = new Word("создавать");
        Word word4 = new Word("композицию");
        Word word5 = new Word("в");
        Word word6 = new Word("Java");
        Word word7 = new Word("!!!");
        ArrayList<Word> arrayWords = new ArrayList<Word>();
        arrayWords.add(word1);
        arrayWords.add(word2);
        arrayWords.add(word3);
        arrayWords.add(word4);
        arrayWords.add(word5);
        arrayWords.add(word6);
        arrayWords.add(word7);

    }
}
