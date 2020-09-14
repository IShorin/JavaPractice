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
    private Circle diametr;

    public CircleTest(Circle a){
        diametr=a;
    }

    public Circle getDiametr() {
        return diametr;
    }

    public void setDiametr(Circle diametr) {
        this.diametr = diametr;
    }

    public  Circle method(diametr) {
        Circle object = new Circle(a);
        return object;
    }
}


public static void main(String[] args)
{
    CircleTest obx=new CircleTest();
}