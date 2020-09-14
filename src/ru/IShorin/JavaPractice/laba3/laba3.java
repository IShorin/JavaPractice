package ru.IShorin.JavaPractice.laba3;

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
