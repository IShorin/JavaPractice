package ru.IShorin.JavaPractice.laba28;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String []args){
        System.out.print("Pay: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int summ = Math.abs(random.nextInt()/100000);
        System.out.println(summ);
        System.out.println("Cash or card?");
        try {
            String str = scanner.nextLine();
            switch (str) {
                case "Cash": PayByCash payByCash = new PayByCash(summ); break;
                case "Card": PayByCard payByCard = new PayByCard(summ); break;
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
