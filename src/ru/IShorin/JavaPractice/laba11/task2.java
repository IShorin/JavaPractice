package ru.IShorin.JavaPractice.laba11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class main{
    public static void main(String[] args) {
        new task2();
    }
}
 class RoundedBorder implements Border {
    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}

public class task2 extends JFrame {
   //Цвет заднего фона поменять не смог

    public task2() {
        JFrame frame = new JFrame("Task2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);

        setResizable(false);
        setBackground(Color.CYAN);



        JButton button = new JButton("Center");
        button.setBounds(310,200,180,130);
        button.setBackground(Color.WHITE);
        button.setBorder(new RoundedBorder(40));

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЦАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        button.addActionListener(actionListener);
        frame.add(button);

        JButton North = new JButton("North");
        North.setBounds(150,70,500,100);
        North.setBackground(Color.cyan);

        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в САО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        North.addActionListener(actionListener2);
        frame.add(North);

        JButton South = new JButton("South");
        South.setBounds(150,360,500,100);
        South.setBackground(Color.CYAN);

        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЮЗАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        South.addActionListener(actionListener3);
        frame.add(South);


        JButton East = new JButton("East");
        East.setBounds(150,190,150,150);
        East.setBackground(Color.GRAY);

        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в СВАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        East.addActionListener(actionListener4);
        frame.add(East);

        JButton West = new JButton("West");
        West.setBounds(500,190,150,150);
        West.setBackground(Color.LIGHT_GRAY);

        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЗАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        West.addActionListener(actionListener5);
        frame.add(West);



        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }
}