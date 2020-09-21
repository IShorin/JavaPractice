package ru.IShorin.JavaPractice.laba5;

 public class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoint center;

     public MovableCircle(int radius, int x, int y, int ySpeed, int xSpeed) {
         this.radius=radius;
         MovablePoint center= new MovablePoint(x, y, ySpeed, xSpeed);

     }

     @Override
     public String toString() {
         return "MovableCircle{}";
     }


     @Override
     public void moveUp() {
         center.moveUp();
     }

     @Override
     public void moveDown() {
         center.moveDown();

     }

     @Override
     public void moveLeft() {
         center.moveLeft();

     }

     @Override
     public void moveRight() {
         center.moveRight();
     }
 }
