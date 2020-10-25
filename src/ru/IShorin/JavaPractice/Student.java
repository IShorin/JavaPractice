package ru.IShorin.JavaPractice;

///////////////////////////////////////////////////////////////
//повторение 1го задания(почти) используется и для 2го и для 3го задания
public class Student {
    private String name;
    private int age;
    private int IDnum;
    private double gpa;//только добавляем в класс средний балл

    public Student(String name, int age, int IDnum, double gpa) {
        this.name = name;
        this.age = age;
        this.IDnum = IDnum;
        this.gpa = gpa;
    }


    public boolean compareTo(Student student) {
        if (student.getIDnum() < IDnum) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + IDnum +
                ", gpa=" + gpa +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                IDnum == student.IDnum &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIDnum() {
        return IDnum;
    }

    public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
