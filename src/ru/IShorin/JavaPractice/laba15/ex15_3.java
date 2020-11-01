package ru.IShorin.JavaPractice.laba15;

import ru.IShorin.JavaPractice.Student;

class List {
    private Student[] students = {};

    public List(Student[] students) {
        this.students = students;
    }

    public void sort(Student[] students) {
        int min;
        Student temp;
        for (int index = 0; index < students.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < students.length; scan++)
                if (!students[scan].compareTo(students[min]))
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public int binarySearch(Student[] students, Student student) {
        int firstIndex = 0;
        int lastIndex = students.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (students[middleIndex] == student) {
                return middleIndex;
            } else if (students[middleIndex].getIDnum() < student.getIDnum())
                firstIndex = middleIndex + 1;

            else if (students[middleIndex].getIDnum() > student.getIDnum())
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}

