package ru.IShorin.JavaPractice.laba16;

import java.util.ArrayList;

public class ex_16 {

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        ArrayList<Integer> mas1 = new ArrayList<>();
        ArrayList<Integer> mas2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            mas1.add(a1[i]);
            mas2.add(a2[i]);
        }
//заполняем списки

        int count = 0;//счетчик
        boolean res = false; // результат в виде булевой переменной

        for (int i = 0; i < 106; i++) {
            count++;
            if (mas1.get(0) > mas2.get(0) || ((mas1.get(0) == 0) && (mas2.get(0) == 9))) {

                mas1.add(mas1.get(0));
                mas1.add(mas2.get(0));

            } else if (mas1.get(0) < mas2.get(0) || ((mas1.get(0) == 9) && (mas2.get(0) == 0))) {

                mas2.add(mas2.get(0));
                mas2.add(mas1.get(0));
            }
            mas1.remove(0);//чистим список для проверки следующих карт
            mas2.remove(0);//чистим список для проверки следующих карт

            if (mas1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (mas2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("end");
    }
}
