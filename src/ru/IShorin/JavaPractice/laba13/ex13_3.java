package ru.IShorin.JavaPractice.laba13;

import ru.IShorin.JavaPractice.Student;

import java.util.*;

 class MergeLists {
    Student[] st1 = {
            new Student("Nothan",19,1001,4.5),
            new Student("Sothan",20, 1003,4.3),
            new Student("Gothan",21,1002,4.1)
    };
    Student[] st2 = {
            new Student("Nothan1",19,1005,4.6),
            new Student("Sothan1",18, 1004,4.4),
            new Student("Gothan1",22,1006,4.8)
    };
    public void merge(){
        List <Student> list_of_st1 = new ArrayList<Student>(Arrays.asList(st1));
        List <Student> list_of_st2 = new ArrayList<Student>(Arrays.asList(st2));
        List <Student> list_of_res = new ArrayList<Student>();

        list_of_res.addAll(list_of_st1);
        list_of_res.addAll(list_of_st2);
        Collections.sort(list_of_res, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
        System.out.println(list_of_res.toString());
    }
}

class main {
    public static void main(String []args){
        MergeLists ls = new MergeLists();
        ls.merge();
    }
}
