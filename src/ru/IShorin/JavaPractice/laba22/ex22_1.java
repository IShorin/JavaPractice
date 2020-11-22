package ru.IShorin.JavaPractice.laba22;

import ru.IShorin.JavaPractice.Student;

import java.util.Scanner;

public class ex22_1 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write data");
        Student student = new Student(scanner.nextLine());
        System.out.println(student.toString(scanner.nextLine()));
    }
}