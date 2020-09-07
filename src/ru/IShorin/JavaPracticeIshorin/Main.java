package ru.IShorin.JavaPracticeIshorin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        int[] mas={1,2,3,4,5,6,7};
        sumMas(mas);
        System.out.printf("\n");
        out(args);
        System.out.printf("\n");
        harmonySum();
        System.out.printf("\n");
        RandAndSortFunc(mas);
        System.out.printf("\n");
        factorial();
    }

    public static void factorial() {
        int res=1;
        for (int i = 1; i <= 5; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
    public static void sumMas(int[] mas){
        int sum=0;
        for (int i = 0; i < mas.length; i++) {
            sum=sum+mas[i];
        }
        System.out.print(sum);
    }

    public static void out(String[] a) {

        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }

    public static void harmonySum()  {
        for (double i = 1; i <10; i++) {
            double var =1.0/i;
            String message=String.format("%.2f",var);
            System.out.print(message);
            System.out.print(" ");

        }

    }
    public static void RandAndSortFunc(int mas[]) {
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i]);
            System.out.print(" ");
        }
        System.out.printf("\n");
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            System.out.print(" ");

        }


    }


}
