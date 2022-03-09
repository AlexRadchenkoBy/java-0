package com.company.oop.composition.text;

import java.util.ArrayList;
//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

public class Text {
    private ArrayList<Sentence> sentences;

    public Text(ArrayList<Sentence> sentences) {

        this.sentences = sentences;
    }


}
