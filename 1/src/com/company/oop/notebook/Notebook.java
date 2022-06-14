package com.company.oop.notebook;

import com.company.oop.library.Book;
import com.company.oop.vouchers.Voucher;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Notebook {
    private ArrayList<Note> notes;

    private static final String NOTE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
            "company\\oop" + "\\notebook" + "\\resource\\Notes.txt";

    public Notebook() throws Exception {
        this.notes = readNote(NOTE_PATH);
    }

    public void runProgram() throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1 - Создать заметку
                    2 - Найти запись по дате создания
                    3 - Найти запись по ключевому слову""");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 1) {
                addNote();
            } else if (number == 2) {
                System.out.print("Введите дату создания записи: ");
                String date = scanner.nextLine();
                printNote(searchRecord(date));
            }
        }
    }

    public ArrayList<Note> searchRecord(String date) {
        ArrayList<Note> record = new ArrayList<>();
        for (Note note : notes) {
            if (Objects.equals(date, note.getCreationDate())) {
                record.add(note);
            }
        }
        record.sort(Comparator.comparing(Note::getTopic));
        return record;
    }

    public void printNote(Note note) {
        System.out.println(note.getTopic() + "," + note.getCreationDate() + "," + note.getEmail() + "," +
                note.getMessage());
    }

    public void addNote() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Тема: ");
        String topic = scanner.nextLine();
        System.out.print("Дата создания: ");
        String date = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Сообщение: ");
        String message = scanner.nextLine();
        createNote(topic, date, email, message);
    }

    public void createNote(String topic, String creationDate, String email, String message) throws IOException {
        Note note = new Note(topic, creationDate, email, message);
        notes.add(note);
        saveNote(note, true);
    }

    public void saveNote(Note note, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(NOTE_PATH, append);
        fileWriter.write("\n" + note.getTopic() + "," + note.getCreationDate() + "," + note.getEmail() + "," +
                note.getMessage());
        fileWriter.flush();
    }

    public ArrayList<Note> readNote(String pathToFile) throws Exception {
        ArrayList<String> rows = new ArrayList<>();
        FileReader file = new FileReader(pathToFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            rows.add(scanner.nextLine());
        }
        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 1; i < rows.size(); i++) {
            String[] fields = rows.get(i).split(",");
            Note note = new Note(fields[0], fields[1], fields[2], fields[3]);
            notes.add(note);
        }
        return notes;
    }
}

