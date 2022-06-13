package com.company.oop.notebook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    private ArrayList<Note> notes;

    public Notebook(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public Notebook(String s, String s1) {
    }

    public void runProgram() {
        System.out.println("1 - Создать заметку");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {

        }

    }

    public void addNote(String topic, String dateOfCreation, String email, Message message) throws IOException {
        String fileData = "Some Test";
        FileOutputStream fos = new FileOutputStream("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\notebook" + "\\resource\\note1.txt");
        fos.write(fileData.getBytes());
        fos.flush();
        fos.close();
    }
}
