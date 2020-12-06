package ru.IShorin.JavaPractice.laba25;

import java.util.Scanner;

 class main_2{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(validIP(scanner.nextLine()));
    }
    public static boolean validIP (String ip) {
        String regexp = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";
        if (ip.matches(regexp)) {
            return true;
        }
        else {
            return false;
        }
    }
}