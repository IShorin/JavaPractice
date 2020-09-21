package ru.IShorin.JavaPractice.laba6;

class Rectangle implements Movable{
    int x1;
    int y1;
    int x;
    int y;
    int xSpeed;
    int x1Speed;
    int ySpeed;
    int y1Speed;

    public Rectangle(int x1, int y1, int x1Speed, int y1Speed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x1Speed = x1Speed;
        this.y1Speed = y1Speed;
    }


    @Override
    public void moveUp() {
        y+=ySpeed;
        y1+=y1Speed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
        y1-=y1Speed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        x1-=x1Speed;

    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        x1+=x1Speed;
    }
}
