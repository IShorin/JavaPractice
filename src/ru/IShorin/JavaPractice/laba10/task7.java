package ru.IShorin.JavaPractice.laba10;

public class task7 {
    public static void main(String []args){
        int n=10;
        recurs(10);
    }
    public static void recurs(int n){
        int m=2;
        while(m<=n){
            if(n%m==0) {
                System.out.print(m + " ");
                if (m == n) {
                    return;
                }
                break;
            }
            m++;
        }
        recurs(n/m);
    }
}
