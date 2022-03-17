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
        String str = "";
        for (int i = 0; i < words.size(); i++) {
            str = str.trim() + " " + words.get(i).toString() + "\n";
        }
        return str;
    }


}
