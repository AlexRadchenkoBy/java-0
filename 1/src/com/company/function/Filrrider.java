package com.company.function;
import java.io.FileReader;
import java.util.Scanner;

public class Filrrider  {

    public static void main (String[] args) throws Exception {

        FileReader file = new FileReader("C:\\Users\\alexr\\nekl.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        file.close();
    }
}
