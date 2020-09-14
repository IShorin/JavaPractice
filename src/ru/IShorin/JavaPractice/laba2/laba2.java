package ru.IShorin.JavaPractice.laba2;

class Shape {

    private int a;
    private int b;
    public Shape(){
        a=50;
        b=100;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
class Ball {
    private int c;
    private int d;

    public Ball() {
        c = 50;
        d = 100;
    }

    int getC() {
        return c;
    }

    int getD() {
        return d;
    }
}
class Book {
    private int f;
    private int g;

    public Book(){
        f=50;
        g=100;
    }

    int getF(){
        return f;
    }
    int getG(){
        return g;
    }
}
class Dog {
    private String name1;
    private int year1;

    public Dog(String name, int year){
        name1=name;
        year1=year;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name1;
    }

    public void setYear(int year) {
        this.year1 = year1;
    }

    public int getYear() {
        return year1;
    }
    public int humanYear(){
        return year1*7;
    }

    @Override
    public String toString() {


        return "Dog{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}

class Main {
    private Dog mas[] = new Dog[10];

    int i = 0;
    String klich = "Шарик";
    int vozrast = 7;

    public void addDog() {
        Dog object = new Dog(klich, vozrast);
        mas[i] = object;
    }
}


