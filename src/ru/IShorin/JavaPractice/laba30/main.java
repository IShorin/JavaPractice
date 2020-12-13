package ru.IShorin.JavaPractice.laba30;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Price and description");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(quantity, name, description);
    }

}
class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Price Name Description");
        int price = in.nextInt();
        String name = in.next();
        String desc = in.next();
        MenuItem menuItem = new MenuItem(price, name, desc);
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Vano\\Desktop\\test.txt", false);
            fileWriter.write(menuItem.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Vano\\Desktop\\test.txt");
            System.out.println("output");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
