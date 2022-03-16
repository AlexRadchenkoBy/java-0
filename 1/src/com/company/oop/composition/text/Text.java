package com.company.oop.composition.text;

import java.util.ArrayList;
//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

public class Text {
    private Sentence title;
    private ArrayList<Sentence> sentences;

    public Text(Sentence title, ArrayList<Sentence> sentences) {
        this.title = title;
        this.sentences = sentences;
    }

    public void addText(ArrayList<Sentence> sentences) {
        this.sentences.addAll(sentences);
    }

    public String toString() {
        return "title" + title + "sentence" + sentences;
    }
}
