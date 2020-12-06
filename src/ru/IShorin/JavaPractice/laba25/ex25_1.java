package ru.IShorin.JavaPractice.laba25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class main_1 {
    public static void main(String []args){
        String tmp = "Text_1";
        boolean res = Pattern.matches("TEXT_2", tmp);
        System.out.println(res);
        Pattern pattern = Pattern.compile("TEXT_3");//
        Matcher matcher = pattern.matcher("TEXT_4");
        res = matcher.matches();
        System.out.println(res);
        String newStr = matcher.replaceAll("Another");
        System.out.println(newStr);
    }
}