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

    @Override
    public String toString() {
        return sentences.toString() + " " + title.toString();
    }


}
