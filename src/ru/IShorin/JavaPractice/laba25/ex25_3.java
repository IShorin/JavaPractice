package ru.IShorin.JavaPractice.laba25;

import java.util.Scanner;
import java.util.regex.*;

class main_3 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(check(scanner.nextLine()));
    }
    private static boolean check(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}