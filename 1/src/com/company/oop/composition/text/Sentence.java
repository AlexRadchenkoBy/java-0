package com.company.oop.composition.text;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words;

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public String toString() {
        ArrayList<Word> wordList = new ArrayList<Word>();
        for (int i = 0; i < words.size(); i += 2) {
            wordList.add(words.get(i) + words.get(i + 1));
        }
        return wordList;
    }


}
