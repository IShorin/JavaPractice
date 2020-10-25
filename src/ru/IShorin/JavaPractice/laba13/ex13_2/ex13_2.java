package ru.IShorin.JavaPractice.laba13.ex13_2;

import ru.IShorin.JavaPractice.Student;

 interface Comparator {
    void sort(Student[]students);
}


class SortingStudentsGPA implements Comparator {
    public void sort(Student[] students) {
       // mergeSort(students);
        int low = 0;
        int high = students.length - 1;
        // quickSort(students,low,high); на выбор 2 сортировки
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
    //Быстрая сортировка
    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGpa() > opora.getGpa()) {
                i++;
            }

            while (array[j].getGpa() < opora.getGpa()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    //сортировка слиянием

    public static void mergeSort(Student[] array) {
        if (array.length > 1) {
            Student[] left = leftHalf(array);
            Student[] right = rightHalf(array);
            mergeSort(left);//сортировка левой части части
            mergeSort(right);//сортировка правой части
            merge(array, left, right);//сортировка обеих частей
        }
    }
    public static Student[] leftHalf(Student[] array) {
        int size1 = array.length / 2;
        Student[] left = new Student[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }
    public static Student[] rightHalf(Student[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        Student[] right = new Student[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    public static void merge(Student[] result, Student[] left, Student[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1].getGpa() >= right[i2].getGpa())) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}

//main
class main {
    public static void main(String []args){
        Student[]students = {
                new Student("Nothan",19,1001,4.5),
                new Student("Sothan",20, 1003,4.3),
                new Student("Gothan",21,1002,4.1)
        };
        SortingStudentsGPA srt = new SortingStudentsGPA();
        srt.sort(students);
    }
}
