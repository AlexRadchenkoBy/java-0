package com.company.oop.notebook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    private ArrayList<Note> notes;

    public Notebook() {
        this.notes = notes;
    }

    public void runProgram() {
        System.out.println("1 - Создать заметку");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {

        }

    }

    public void addNote(String topic, String dateOfCreation, String email, String message) throws IOException {
        String fileData = "Some Test";
        FileOutputStream fos = new FileOutputStream("C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
                "company\\oop" + "\\notebook" + "\\resource\\note1.txt");
        fos.write(fileData.getBytes());
        fos.flush();
        fos.close();
    }
}
