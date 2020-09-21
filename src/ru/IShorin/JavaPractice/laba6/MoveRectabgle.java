package ru.IShorin.JavaPractice.laba6;

import ru.IShorin.JavaPractice.laba5.MovablePoint;

class MoveRectangle implements Movable {
    protected Rectangle point_1;
    protected Rectangle point_2;

    public MoveRectangle(int x1, int y1, int x, int y, int xSpeed, int x1Speed, int ySpeed, int y1Speed) {
        Rectangle point_1=new Rectangle(x1,y1,x1Speed,y1Speed);
        Rectangle point=new Rectangle(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{}";
    }


    @Override
    public void moveUp() {
        point_2.moveUp();
        point_1.moveUp();
    }

    @Override
    public void moveDown() {
        point_1.moveDown();
        point_2.moveDown();

    }

    @Override
    public void moveLeft() {
        point_2.moveLeft();
        point_1.moveLeft();

    }

    @Override
    public void moveRight() {
        point_2.moveRight();
        point_1.moveRight();
    }
    boolean PointSpeed(int x1Speed,int y1Speed,int xSpeed, int ySpeed){
        if (x1Speed==y1Speed && xSpeed==ySpeed){
            return true;
        }else return false;
    }
 }
