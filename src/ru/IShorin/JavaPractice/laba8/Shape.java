package ru.IShorin.JavaPractice.laba8;

import javax.swing.*;
import java.awt.*;

public class Shape {

    public static void main(String[] args) {
        JFrame jf=new JFrame("For2D");
        jf.setSize(200,150);
        jf.setVisible(true);
        jf.add(new Board());
    }

}
class Board extends Panel{
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        draw1(g);;
    }

    private void draw1(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.blue.darker());
        int w=getWidth();
        int h=getHeight();
        g2d.drawLine(0,0,w,h);
        g2d.drawOval(w/2-50,h/2,100,100);
    }
}


