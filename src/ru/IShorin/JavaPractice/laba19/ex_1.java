package ru.IShorin.JavaPractice.laba19;

import java.util.Scanner;

public class ex_1 {
    public void scanner() {
        System.out.println("Write id and name");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //считываем строку которую пользователь ввел
        String[] parts = str.split(" ");
        //разбиваем ее
        char[] symb = parts[3].toCharArray();
        try {//проверяем ее
            if (symb.length > 10 || symb.length < 10){
                throw (new Exception());
            }
            for (int i=0;i<symb.length;i++){
                if ((i == 0) && (symb[i]=='0')){
                    throw (new Exception());
                }
                if ((symb[i]<'0') && (symb[i]>'9')){
                    throw (new Exception());
                }
            }
            System.out.println("Correct");
        } catch (Exception exe) {
            System.out.println("Error");
        }
    }
}

 class main {
    public static void main(String []args){
        ex_1 catcher = new ex_1();
        catcher.scanner();
    }
}