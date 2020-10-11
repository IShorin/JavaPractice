package ru.IShorin.JavaPractice.laba10;

public class task17 {
    public static void main(String []args){
        System.out.println(recursion());
    }
    public static int recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recursion());
        }
    }
}