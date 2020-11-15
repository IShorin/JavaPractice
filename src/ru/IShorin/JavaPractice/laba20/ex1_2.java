package ru.IShorin.JavaPractice.laba20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class laba20<E> {
    private List<E> list = new ArrayList<>();
    public laba20(E[] arr) {
        list.addAll(Arrays.asList(arr));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
    public E getByIndex(int index){
        return list.get(index);
    }
     public void showFive(){
         int i=0;
         for (Object ls : list){
             System.out.println(i + ": " + ls);
             if (i==4){ break;}
             i++;
         }
     }
}
class main {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        laba20<Integer> listInt = new laba20(numbers);
        listInt.showList();
    }
}
 class main_2 {
    public static void main(String[] args) {
        String[] lines = {"Str_0", "Str_1", "Str_2", "Str_3", "Str_4", "Str_5"};
        laba20<String> listStr = new laba20(lines);
        listStr.showList();
        System.out.println(listStr.getByIndex(2));

    }
}
class main_3 {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        laba20<Integer> listInt = new laba20(numbers);
        listInt.showList();
        String[] lines = {"String0", "String1", "String2", "String3", "String4", "String5"};
        laba20<String> listStr = new laba20(lines);
        listStr.showFive();
    }
}