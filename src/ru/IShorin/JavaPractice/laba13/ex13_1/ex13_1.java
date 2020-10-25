package ru.IShorin.JavaPractice.laba13.ex13_1;
class Student{
    private String name;
    private double average;
    private int IDnum;

    public Student(String name, double average,int IDnum) {
        this.name = name;
        this.average = average;
        this.IDnum=IDnum;

    }
    public boolean compareTo(Student student){
        if (student.getIDnum() < IDnum) return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public int getIDnum() {
        return IDnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }
}
class StudentTest {
    Student []students = {
            new Student("Nothan",4.5,1001),
            new Student("Sothan",4.3, 1003),
            new Student("Gothan",4.1,1002),
    };
    public void sort(){
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
}




