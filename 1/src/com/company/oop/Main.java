package com.company.oop;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        chekCounter();
    }

    public static void checkStudent() {
        Student student1 = new Student("Alekseev S.V.", 4, new int[]{4, 6, 7, 6, 8});
        Student student2 = new Student("Bogration P.A.", 1, new int[]{9, 10, 10, 9, 9});
        Student student3 = new Student("Vatutin F.M.", 3, new int[]{7, 8, 9, 10, 6});
        Student student4 = new Student("Gradov N.F.", 5, new int[]{6, 4, 7, 9, 10});
        Student student5 = new Student("Denikin A.P.", 2, new int[]{9, 10, 10, 9, 9});
        Student student6 = new Student("Esenin S.A.", 6, new int[]{9, 8, 10, 8, 9});
        Student student7 = new Student("Zagloba M.A.", 1, new int[]{9, 6, 10, 4, 9});
        Student student8 = new Student("Kulnev J.S.", 2, new int[]{7, 8, 9, 8, 9});
        Student student9 = new Student("Kuleshov A.A.", 4, new int[]{9, 9, 9, 9, 9});
        Student student10 = new Student("Zukov G.K.", 5, new int[]{9, 8, 10, 8, 9});
        Student[] students = {student1, student2, student3, student4, student5,
                student6, student7, student8, student9, student10};

        getExcellentStudent(students);
    }

    public static void getExcellentStudent(Student[] students) {
        for (Student student : students) {
            int negativeRatings = 0;
            for (int i : student.getAcademicPerformance()) {
                if (i < 9) {
                    negativeRatings++;
                }
            }
            if (negativeRatings == 0) {
                System.out.println(student.getSurnameAndInitials() + " " + student.getGroupNumber());
            }
        }
    }

    public static void checkTrain() {
        Train train1 = new Train("Minsk", 1, 14, 0);
        Train train2 = new Train("Minsk", 3, 8, 0);
        Train train3 = new Train("Berlin", 5, 14, 0);
        Train train4 = new Train("Kiev", 4, 12, 0);
        Train train5 = new Train("Vilnius", 2, 19, 0);
        Train[] trains = {train1, train2, train3, train4, train5};
        sortByTrainNumber(trains);
        printTrains(trains);
        getTrainInformaition(trains);
        sortByDestinationAndTime(trains);
        printTrains(trains);
    }

    public static void sortByTrainNumber(Train[] trains) {
        Train temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if(trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
                    isSorted = false;
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                }
            }
        }
    }

    public static void getTrainInformaition(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для информации о поезде введите его номер от 1 до 5");
        int numberTrain = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (numberTrain == trains[i].getTrainNumber()) {
                System.out.println(trains[i]);
            }
        }
    }

    public static void sortByDestinationAndTime(Train[] trains) {
        Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public static void printTrains(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }

    public static void chekCounter() {
        Counter count = new Counter(2, 8, 6);
            count.incriment();
            printCounter(count);
            count.decriment();
            printCounter(count);
    }

    public static void printCounter(Counter count) {
        for (int i = 0; i < 1; i++) {
            System.out.println(count.incriment() + " " + count.decriment());
        }
    }
}
