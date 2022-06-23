package com.company.oop.notebook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    private ArrayList<Note> notes;
    private Scanner scanner;

    private static final String NOTE_PATH = "C:\\Users\\alexr\\Dev\\java-0\\1\\src\\com\\" +
            "company\\oop" + "\\notebook" + "\\resource\\Notes.txt";

    public Notebook() throws Exception {
        this.notes = readNote(NOTE_PATH);
        scanner = new Scanner(System.in);
    }

    public void runProgram() throws Exception {
        while (true) {
            System.out.println("""
                    0 - Завершить работу
                    1 - Создать заметку
                    2 - Найти запись по дате создания
                    3 - Найти запись по слову и изменить её
                    4 - Показать все записи""");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                System.exit(0);
            } else if (number == 1) {
                addNote();
            } else if (number == 2) {
                scannerSearchDate();
            } else if (number == 3) {
                scannerSearchWord();
            } else if (number == 4) {
                printNote(notes);
            }
        }
    }

    public void addNote() throws Exception {
        System.out.print("Тема: ");
        String topic = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Сообщение: ");
        String message = scanner.nextLine();
        createNote(topic, email, message);
    }

    public void scannerSearchDate() throws ParseException {
        System.out.print("Введите дату создания записи: ");
        String date = scanner.nextLine();
        printNote(searchRecord(date));
    }

    public void scannerSearchWord() throws IOException {
        System.out.print("Введите ключевое слово: ");
        String word = scanner.nextLine();
        ArrayList<Note> search = wordSearch(word);
        printNote(search);
        System.out.print("Измменить запись : ");
        String note = scanner.nextLine();
        changeMessage(search, note);
    }

    public void changeMessage(ArrayList<Note> notes, String message) throws IOException {
        for (Note note : notes) {
            note.setMessage(message);
            saveAllMessage();
        }
    }

    public void saveAllMessage() throws IOException {
        FileWriter fileWriter = new FileWriter(NOTE_PATH, false);
        for (int i = 0; i < notes.size(); i++) {
            String noteString = notes.get(i).getTopic() + "," +
                    new SimpleDateFormat("dd MM yyyy").format(notes.get(i).getCreationDate()) + "," + notes.get(i).getEmail() +
                    "," + notes.get(i).getMessage();
            if (i != 0) {
                noteString = "\n" + noteString;
            }
            fileWriter.write(noteString);
        }
        fileWriter.flush();
    }

    public ArrayList<Note> wordSearch(String word) {
        ArrayList<Note> record = new ArrayList<>();
        for (Note note : notes) {
            if (note.getMessage().contains(word)) {
                record.add(note);
            }
        }
        return record;
    }

    public boolean isValidDate(String date) {
        String regex = "^[0-9]{2} [0-9]{2} [0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public ArrayList<Note> searchRecord(String date) throws ParseException {
        ArrayList<Note> record = new ArrayList<>();
        if (isValidDate(date)) {
            for (Note note : notes) {
                if (Objects.equals(new SimpleDateFormat("dd MM yyyy").parse(date), note.getCreationDate())) {
                    record.add(note);
                }
            }
            record.sort(Comparator.comparing(Note::getTopic));
        } else {
            System.out.println("Некорректный формат! Введите - dd MM yyyy");
        }
        return record;
    }

    public void printNote(ArrayList<Note> notes) {
        for (Note note : notes) {
            System.out.println(note.getTopic() + "," +
                    new SimpleDateFormat("dd MM yyyy").format(note.getCreationDate()) + "," + note.getEmail() +
                    "," + note.getMessage());
        }
    }

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z_0-9+.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void createNote(String topic, String email, String message) throws IOException {
        Note note = new Note(topic, email, message);
        if (isValidEmail(email)) {
            notes.add(note);
            saveNote(note, true);
        } else {
            System.out.println("Невалидный Email!");
        }
    }

    public void saveNote(Note note, boolean append) throws IOException {
        FileWriter fileWriter = new FileWriter(NOTE_PATH, append);
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        String strDate = dateFormat.format(date);
        fileWriter.write("\n" + note.getTopic() + "," + strDate + "," + note.getEmail() + "," +
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
        for (int i = 0; i < rows.size(); i++) {
            String[] fields = rows.get(i).split(",");
            Note note = new Note(fields[0], new SimpleDateFormat("dd MM yyyy").parse(fields[1]), fields[2],
                    fields[3]);
            notes.add(note);
        }
        return notes;
    }
}

