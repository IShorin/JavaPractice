package ru.IShorin.JavaPractice.laba7;

public abstract class Dish {
    protected int radius;
}
class Plate extends Dish{
  protected int  a;
  protected int b;

    public Plate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class Plate_2 extends Dish{
    protected int c;
    protected double d;

    public Plate_2(int c, double d) {
        this.c = c;
        this.d = d;
    }
}

