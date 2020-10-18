package ru.IShorin.JavaPractice.laba11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Main {
    public static void main(String[] args) {
        new task3();
    }
}

 class task3 extends JFrame{
    public task3() {
        JFrame frame = new JFrame("task3");
        Label lb = new Label("Choose font");
        lb.setFont(new Font("Times New Roman", Font.LAYOUT_RIGHT_TO_LEFT, 14));
        lb.setBounds(30, 10, 300, 20);
        frame.add(lb);
//создаем меню типа списка и добавляем туда названия 3х шрифтов
        JComboBox faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.addItem("Times New Roman");
        faceCombo.addItem("MS Sans Serif");
        faceCombo.addItem("Courier New");
        faceCombo.setBounds(30, 40, 320, 40);
        frame.add(faceCombo);

        Label lb1 = new Label("Choose color");
        lb1.setFont(new Font("Times New Roman", Font.LAYOUT_RIGHT_TO_LEFT, 14));
        lb1.setBounds(30, 90, 300, 20);
        frame.add(lb1);
//создаем меню типа списка и добавляем туда названия 3х цветов
        JComboBox faceCombo2 = new JComboBox();
        faceCombo2.setEditable(true);
        faceCombo2.addItem("Blue");
        faceCombo2.addItem("Red");
        faceCombo2.addItem("Black");
        faceCombo2.setBounds(30, 120, 320, 40);
        frame.add(faceCombo2);


//создаем поля согласно заданным параметрам
        JTextArea bigField = new JTextArea("", 2, 3);
        bigField.setFont(new Font("", Font.LAYOUT_RIGHT_TO_LEFT, 18));
        bigField.setBackground(Color.WHITE);
        bigField.setForeground(Color.BLUE);
        bigField.setFont(new Font("Times New Roman", Font.BOLD, 15));
        bigField.setBounds(30, 170, 320, 40);

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo.getSelectedIndex()==0) {
                    bigField.setFont(new Font("Times New Roman", Font.BOLD, 15));
                }
                else if (faceCombo.getSelectedIndex()==1) {
                    bigField.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
                }
                else if (faceCombo.getSelectedIndex()==2) {
                    bigField.setFont(new Font("Courier New", Font.BOLD, 15));
                }
            }
        });

        faceCombo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo2.getSelectedIndex()==0) {
                    bigField.setForeground(Color.BLUE);
                }
                else if (faceCombo2.getSelectedIndex()==1) {
                    bigField.setForeground(Color.RED);
                }
                else if (faceCombo2.getSelectedIndex()==2) {
                    bigField.setForeground(Color.BLACK);
                }
            }
        });
        frame.add(bigField);
        frame.setSize(400,300);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
