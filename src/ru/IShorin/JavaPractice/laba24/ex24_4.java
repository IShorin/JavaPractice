package ru.IShorin.JavaPractice.laba24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Phone {
    public static void main(String[] args) {
        System.out.println("+<Country code><10 nums>");
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone(scanner.nextLine());
        phone.numHandler();
        System.out.println(phone.toString());
    }

    private String number;
    private List<String> mainNumber = new ArrayList<>();

    public Phone(String number) {
        this.number = number;

    }

    public void numHandler() {
        char[] chars = number.toCharArray();
        int j = 0;
        if (number.contains("+")) {
            mainNumber.add("+");
            for (int i = 1; i < chars.length - 7; i++) {
                mainNumber.add(String.valueOf(chars[i]));
            }
            mainNumber.add("-");
            for (int i = chars.length - 7; i < chars.length; i++) {
                if (j == 3) {
                    mainNumber.add("-");
                }
                j++;
                mainNumber.add(String.valueOf(chars[i]));
            }
        } else {
            mainNumber.add("+7");
            for (int i = 1; i < chars.length; i++) {
                if (i == 4 || i == 7) {
                    mainNumber.add("-");
                }
                mainNumber.add(String.valueOf(chars[i]));
            }
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mainNumber=" + mainNumber +
                '}';
    }
}
