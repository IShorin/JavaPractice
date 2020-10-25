package ru.IShorin.JavaPractice.laba14;

import ru.IShorin.JavaPractice.Student;

public class ex14_1 {
    public static void main(String []args){
        Search src = new Search();
        Student[] students = {
                new Student("Nothan",19,1001,4.5),
                new Student("Sothan",20, 1003,4.3),
                new Student("Gothan",21,1002,4.1)
        };
        System.out.println(src.search(students, "Иванов").toString()+"\n");
        students=src.sort(students);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}

 class Search {
    public Student search(Student[] students, String name){
        for (Student student : students){
            if (student.getName() == name){
                return student;
            }
        }
        return null;
    }
    public Student[] sort(Student[] students){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (students[scan].getIDnum() < (students[min]).getIDnum())
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        return students;
    }
}