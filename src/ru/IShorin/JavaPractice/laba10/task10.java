package ru.IShorin.JavaPractice.laba10;

public class task10 {
    public static void main(String []args){
        System.out.println(func(158,0));
    }
    public static int func(int n, int i){
        if (n==0){
            return i;
        }
        else{
            return func(n/10,i*10+n%10);
        }
    }
}