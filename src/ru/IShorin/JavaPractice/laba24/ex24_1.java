package ru.IShorin.JavaPractice.laba24;
import java.util.Scanner;

 class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String nameHandler() {

        String[] str = name.split(" ");
        char[] tmp = str[1].toCharArray();
        char[] tmp1 = str[2].toCharArray();
        return str[0] + " " + tmp[0] + "." + tmp1[0] + ".";

    }

}

class main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine());
        System.out.println(person.nameHandler());
    }
}