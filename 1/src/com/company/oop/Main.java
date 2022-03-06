package com.company.oop;
import com.company.oop.Airline.Airline;
import com.company.oop.Airline.Airlines;
import com.company.oop.book.Book;
import com.company.oop.book.Books;
import com.company.oop.customer.Customer;
import com.company.oop.customer.Customers;

import java.io.FileReader;
import java.time.LocalTime;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        chekAirline();
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
        Counter count = new Counter(5, 8, 6);
        System.out.println("Текущее значение " + count.getCurrent());
        System.out.println("Прибавили 1 = " + count.increment());
        System.out.println("Отняли 1 = " + count.decrement());
    }

    public static void chekTime() {
        Time time = new Time(18, 10, 35);
        System.out.println(time);
        time.changeTime(2, 60, 40);
        System.out.println(time);
    }

    public static void chekTriangle() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(5, 5);
        Point point3 = new Point(1, 10);
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle);
    }

    public static void chekCustomer() {

        Customer customer1 = new Customer(1563, "Suvorov", "Aleksandr", "Vasilievich",
                "St. Petersburg", 764345, 83452);
        Customer customer2 = new Customer(4243, "Kutuzov", "Mihail", "Ilarionovich",
                "Moscow", 134539, 34567);
        Customer customer3 = new Customer(2345, "Bagration", "Petr", "Iraklievich",
                "Hrodno", 245319, 14201);
        Customer customer4 = new Customer(1452, "Kalinovsky", "Kastus", "Semenovich",
                "Vilna", 432161, 23415);
        Customer[] arrayCustomers = {customer1, customer2, customer3, customer4};
        Customers customers = new Customers(arrayCustomers);
        Customer[] sortedCustomers = customers.sortAlphabeticalOrder();
        for (int i = 0; i < sortedCustomers.length; i++) {
            System.out.println(sortedCustomers[i]);
        }
        System.out.println();

        Customer[] filteredCustomers = customers.findByCardNumberInterval(200000, 500000);
        for (int i = 0; i < filteredCustomers.length; i++) {
            System.out.println(filteredCustomers[i]);
        }
    }

    public static void chekBook() {
        Book book1 = new Book(2314, "Колосья под серпом твоим", "Короткевич В.", "Минск",
                1975, 645, "15 р.", "Твердый");
        Book book2 = new Book(1432, "Погоня на Грюнвальд", "Тарасов К.", "Гродно",
                2015, 280, "10 р.", "Мягкий");
        Book book3 = new Book(3451, "Новая земля", "Колас Я.", "Минск", 1958,
                125, "8 р.", "Твердый");
        Book book4 = new Book(3421, "В когтях ГПУ", "Олехнович Ф.", "Гомель",
                2017, 245, "4 р.", "Мякгий");
        Book[] bookArray = {book1, book2, book3, book4};
        Books books = new Books(bookArray);
        Book[] filteredBooksAuthor = books.findByAuthor("Тарасов К.");
        for (int i = 0; i < filteredBooksAuthor.length; i++) {
            System.out.println(filteredBooksAuthor[i]);
        }
        System.out.println();

        Book[] filteredPublishingHouse = books.findByPublisher("Минск");
        for (int i = 0; i < filteredPublishingHouse.length; i++) {
            System.out.println(filteredPublishingHouse[i]);
        }
        System.out.println();

        Book[] filteredYearPublishing = books.findMoreYear(1975);
        for (int i = 0; i < filteredYearPublishing.length; i++) {
            System.out.println(filteredYearPublishing[i]);
        }
    }

    public static void chekAirline() {
        Airline airline1 = new Airline("Berlin", 2341, "Boeing 747",12, 4,
                new String[] {"Monday", "Wednesday", "Friday"});
        Airline airline2 = new Airline("Madrid", 4563, "Boeing A380", 10, 30,
                new String[] {"Monday", "Tuesday", "Saturday"});
        Airline airline3 = new Airline("Tokyo", 3214, "Boeing 737", 18, 0,
                new String[] {"Sunday"});
        Airline airline4 = new Airline("Paris", 8216, "Dash-8", 9, 15,
                new String[] {"Monday"});
        Airline airline5 = new Airline("London", 4536, "Boeing 747", 20, 55,
                new  String[] {"Wednesday"});
        Airline airline6 = new Airline("Stumble", 2890, "Boeing 747", 19, 35,
                 new String[] {"Thursday"});
        Airline airline7 = new Airline("Prague", 3780, "ATR", 6, 10,
                  new String[] {"Friday"});
        Airline airline8 = new Airline("Amsterdam", 3457, "Boeing A380", 16,
                40,  new String[] {"Saturday"});
        Airline[] airlineArray = {airline1, airline2, airline3, airline4, airline5, airline6, airline7, airline8};
        Airlines airlines = new Airlines(airlineArray);

        for (int i = 0; i < airlineArray.length; i++) {
            System.out.println(airlineArray[i]);
        }
        System.out.println();

        Airline[] filteredFlightByDestination = airlines.findFlightByDestination("London");
        for (int i = 0; i < filteredFlightByDestination.length; i++) {
            System.out.println(filteredFlightByDestination[i]);
        }
        System.out.println();

        Airline[] filteredFlightByDayOfWeek = airlines.findFlightByDayOfWeek("Tuesday");
        for (int i = 0; i < filteredFlightByDayOfWeek.length; i++) {
            System.out.println(filteredFlightByDayOfWeek[i]);
        }
        System.out.println();

        LocalTime time = LocalTime.of(12, 0);
        Airline[] filteredFlightByDayAndTime = airlines.findflightDayOfWeekAndDepatureTime("Monday", time);
        for (int i = 0; i < filteredFlightByDayAndTime.length; i++) {
            System.out.println(filteredFlightByDayAndTime[i]);
        }
    }
}
