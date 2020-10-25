package ru.IShorin.JavaPractice.laba14;

import ru.IShorin.JavaPractice.Student;

public class ex14_3{

    public void sort(Student[] students){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (!students[scan].compareTo(students[min]))
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
    public int binarySearch(Student[] students, Student student) {
        int firstIndex = 0;
        int lastIndex = students.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (students[middleIndex] == student) {
                return middleIndex;
            }
            else if (students[middleIndex].getIDnum() < student.getIDnum())
                firstIndex = middleIndex + 1;


            else if (students[middleIndex].getIDnum() > student.getIDnum())
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
    public int recursiveBinarySearch(Student[] students, int firstElement, int lastElement, Student student) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (students[mid] == student)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (students[mid].getIDnum() > student.getIDnum())
                return recursiveBinarySearch(students, firstElement, mid - 1, student);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(students, mid + 1, lastElement, student);
        }

        return -1;
    }
}

class main1 {
    public static void main(String []args){
        Student[] students = {
                new Student("Nothan",19,1001,4.5),
                new Student("Sothan",20, 1003,4.3),
                new Student("Gothan",21,1002,4.1)
        };
        ex14_3 st = new ex14_3();
        Student student1 = new Student("Bothan",28,1007,3.9);
        System.out.println(st.recursiveBinarySearch(students, students[0].getIDnum(), students[2].getIDnum(),student1));
    }
}
