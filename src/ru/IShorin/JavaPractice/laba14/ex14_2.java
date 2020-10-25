package ru.IShorin.JavaPractice.laba14;

import ru.IShorin.JavaPractice.Student;

public class ex14_2 {
    Student[] students = {
            new Student("Nothan",19,1001,4.5),
            new Student("Sothan",20, 1003,4.3),
            new Student("Gothan",21,1002,4.1)
    };
    public boolean sort(){
        Student student = new Student("Bothan",28,1007,3.9);
        for (Student student1 : students){
            if (student1.equals(student)){
                return true;
            }
            else return false;
        }
        return false;
    }
}
class main {
    public static void main(String []args){
        ex14_2 st = new ex14_2();
        System.out.println(st.sort());
    }
}