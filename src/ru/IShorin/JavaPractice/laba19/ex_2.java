package ru.IShorin.JavaPractice.laba19;

import ru.IShorin.JavaPractice.Student;

import java.util.Scanner;

class ex_2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Boby", 23, 10003,1203),
                new Student("Baby", 22, 10004,1202),
                new Student("Biby", 21, 10005,1201),
        };
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int id = scanner.nextInt();
        double gpa = scanner.nextInt();
        Student student = new Student(name, age, id,gpa);
        try {
            if (!Search(students, student)) {
                throw (new Exception());
            } else {
                System.out.println("Found");
            }
        } catch (Exception exe) {
            System.out.println("Not found");
        }
    }
    public static boolean Search(Student[] students, Student student) {
        for (Student student1 : students) {
            if (student1.compareTo(student)) {
                return true;
            }
        }
        return false;
    }
}
