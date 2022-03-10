package com.company.oop.composition.text;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words;

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public String toString() {
        return words.toString();
    }


}
