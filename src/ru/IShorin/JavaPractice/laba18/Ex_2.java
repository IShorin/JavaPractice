package ru.IShorin.JavaPractice.laba18;

import java.util.Scanner;

public class Ex_2
{
    public void ex_Demo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        double tmp;
        try {
            tmp = 2.0 / 0.0;
            if (tmp == Double.POSITIVE_INFINITY){
                throw (new ArithmeticException());
            } else
                System.out.println("Gotcha");
        }catch (ArithmeticException exe){
            System.out.println("got adventure");
        }
        finally {
            System.out.println("got block");
        }
    }
}

class main {
    public static void main(String []args){
        Ex_2 exc = new Ex_2();
        exc.ex_Demo();
    }
}
