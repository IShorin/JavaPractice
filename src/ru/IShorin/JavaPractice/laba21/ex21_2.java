package ru.IShorin.JavaPractice.laba21;
 interface Chair {
}
interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
 class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return (new FunctionalChair());
    }

    @Override
    public MagicChair createMagicChair() {
        return (new MagicChair());
    }

    @Override
    public VictorianChair createVictorianChair() {
        return (new VictorianChair(1));
    }
}
 class Client {
    public Chair chair;
    public void sit() {};

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
 class FunctionalChair implements Chair{
    public int sum (int a, int b){
        return a+b;
    }
}
 class MagicChair implements Chair{
    public void doMagic(){
    }
}
class VictorianChair implements Chair{
    private int age;
    public int getAge(){
        return this.age;
    }
    VictorianChair(int age){
        this.age = age;
    }
}