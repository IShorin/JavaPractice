package ru.IShorin.JavaPractice.laba10;

public class task9 {
    public static void main(String []args) {
        int a=5,b=5;
        System.out.println(fun(a,b));

    }
    public static int fun(int a,int b){
        if (a>b+1){
            return 0;
        }
        if (a==0 || b ==0){
            return 1;
        }
        return fun(a, b - 1) + fun(a - 1, b - 1);
    }
}
