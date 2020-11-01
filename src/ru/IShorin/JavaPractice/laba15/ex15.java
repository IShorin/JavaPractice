package ru.IShorin.JavaPractice.laba15;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
///15_1
public class ex15 {
    public static void main(String []args){
        List <Integer> list = new ArrayList<Integer>();
        for (int i=0;i<20;i++){
            list.add(i);
        }
        for (Integer list1 : list){
            System.out.println(list1);
        }
        list.remove(6);
        list.remove(13);
        for (Integer list1 : list){
            System.out.println(list1);
        }
    }
}

///15_2
 class main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("String #1");
        strings.add("String #2");
        strings.add("String #3");
        strings.add("String #4");
        System.out.println(strings.get(2));
        for (String string : strings){
            System.out.println(string);
        }
    }
}
