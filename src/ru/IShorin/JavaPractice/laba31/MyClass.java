package ru.IShorin.JavaPractice.laba31;
import org.junit.Assert;
import org.junit.Test;

public class MyClass {
    private int firstNum;
    private int secondNum;
    private char symbol;
    private double result;

    public MyClass(int firstNum, int secondNum, char symbol) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.symbol = symbol;
        calculate();
    }
    public void calculate(){
        switch (symbol){
            case '+': result = secondNum + firstNum; break;
            case '-': result = firstNum - secondNum; break;
            case '*': result = firstNum*secondNum; break;
            case '/': result = firstNum/secondNum; break;
        }
        return;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", symbol=" + symbol +
                ", result=" + result +
                '}';
    }
}

 class main {
    @Test
    public void test(){
        MyClass myClass = new MyClass(10, 30, '*');
        Assert.assertNotNull(myClass);
    }
    @Test
    public void test1(){
        MyClass myClass = new MyClass(200, 23,'-');
        Assert.assertEquals(178.0, myClass.getResult(),1.5);

    }
}