package ru.IShorin.JavaPractice.laba7;

public abstract class Dog {
    protected int radius;
}
class Ovcharka extends Dog{
    protected int  a;
    protected int b;

    public Ovcharka(int a, int b) {
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
class Labrador extends Dog{
    protected int c;
    protected double d;

    public Labrador(int c, double d) {
        this.c = c;
        this.d = d;
    }
}

