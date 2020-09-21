package ru.IShorin.JavaPractice.laba7;

public abstract class Furniture {

}
 class Chair_1 extends Furniture{
    private String color;
    private int price;

     public Chair_1(String color, int price) {
         this.color = color;
         this.price = price;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public String getColor() {
         return color;
     }

     public int getPrice() {
         return price;
     }
 }
class Chair_2 extends Furniture{
    private String color;
    private int price;

    public Chair_2(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
class FurnitureShop{
    public static void main(String[] args) {
        Chair_1 obx=new Chair_1("red",1200);
        Chair_2 obx2=new Chair_2("black",1500);
        System.out.println("There is 2 chairs");
       obx.getPrice();
        System.out.println("/n");
       obx.getColor();
        System.out.println("/n");
       obx2.getColor();
        System.out.println("/n");
       obx.getPrice();
    }
}
