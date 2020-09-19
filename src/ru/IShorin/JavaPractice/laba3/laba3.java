package ru.IShorin.JavaPractice.laba3;
//////////////////////Task 1
class Circle {
    private int d;

    public Circle(int di){
        d=di;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

}
class CircleTest {

    public static void main(String[] args) {
        int a= 5;
        Circle obx = new Circle(a);
        System.out.println(obx);
    }

}
/////////////////////////// Task 2
class Human{


    private Head obx=new Head();
    private Leg obx1=new Leg();
    private Hand obx2=new Hand();

}
class Head{
    private int a=5;
    public int getHead() {
        return a;
    }

    public void setHead(int a) {
        this.a = a;
    }
}
class Leg{
    private int b=10;
    public int getLeg() {
        return b;
    }

    public void setLeg(int b) {
        this.b = b;
    }
}

class Hand{
    private int c=5;
    public int getHand() {
        return c;
    }

    public void setHand(int c) {
        this.c = c;
    }
}
/////////////////////////Task 3
class Book{
    private String author;
    private String name;
    private int year;
    public Book(String a, String b, int c){
        author=a;
        name=b;
        year=c;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class BookTest{
    public static void main(String[] args) {
        String a="Достоевский";
        String b="Ушел домой";
        int c= 1945;
        Book obx=new Book(a,b,c);
        System.out.println(obx);
    }
}


