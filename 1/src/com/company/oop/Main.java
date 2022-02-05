package com.company.oop;

import com.company.oop.employee.Cashier;
import com.company.oop.employee.Manager;

public class Main {

    public static void main(String[] args) {
       Student student1 = new Student("Alekseev S.V.", 4, new int[] {4, 6, 7, 6, 8});
       Student student2 = new Student("Bogration P.A.", 1, new int[] {9, 10, 10, 9, 9});
       Student student3 = new Student("Vatutin F.M.", 3, new int[] {7, 8, 9, 10, 6});
       Student student4 = new Student("Gradov N.F.", 5, new int[] {6, 4, 7, 9, 10});
       Student student5 = new Student("Denikin A.P.", 2, new int[] {9, 10, 10, 9, 9});
       Student student6 = new Student("Esenin S.A.", 6, new int[] {9, 8, 10, 8, 9});
       Student student7 = new Student("Zagloba M.A.", 1, new int[] {9, 6, 10, 4, 9});
       Student student8 = new Student("Kulnev J.S.", 2, new int[] {7, 8, 9, 8, 9});
       Student student9 = new Student("Kuleshov A.A.", 4, new int[] {9, 9, 9, 9, 9});
       Student student10 = new Student("Zukov G.K.", 5, new int[] {9, 8, 10, 8, 9});
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
}
