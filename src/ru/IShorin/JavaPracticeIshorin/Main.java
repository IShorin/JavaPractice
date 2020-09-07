package ru.IShorin.JavaPracticeIshorin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        int[] mas={1,2,3,4,5,6,7};
        //out(args);
        harmonySum();
    }

    public static long factorial(long a) {
        int res=1;
        for (int i = 1; i <= a; i++){
            res=res*i;
        }
        a=res;
        return a ;
    }
    public static int sumMas(int[] mas){
        int sum=0;
        for (int i = 0; i < mas.length; i++) {
            sum=sum+mas[i];
        }
        return sum;
    }

    public static void out(String[] a) {

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    public static void harmonySum()  {
        double num=1;
        for (double i = 1; i <10; i++) {
            System.out.println(num/i);

        }

    }

}
