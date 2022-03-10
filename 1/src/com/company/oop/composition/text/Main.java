package com.company.oop.composition.text;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    chekText();
    }

    public static void chekText() {
        ArrayList<Word> words = new ArrayList<Word>();
        Word word = new Word("Hello");
        Word word1 = new Word("Anton");
        words.add(word);
        words.add(word1);

        ArrayList<Word> words1 = new ArrayList<Word>();
        Word word2 = new Word("Good");
        Word word3 = new Word("luck");
        words1.add(word2);
        words1.add(word3);

        ArrayList<Word> titleText = new ArrayList<Word>();
        Word title1 = new Word("Hi");
        titleText.add(title1);

        ArrayList<Sentence> sentences = new ArrayList<Sentence>();
        Sentence sentence = new Sentence(words);
        Sentence sentence1 = new Sentence(words1);
        Sentence title = new Sentence(titleText);
        sentences.add(sentence);
        sentences.add(sentence1);
        Text text = new Text(title, sentences);

        System.out.println(text);


    }
}
