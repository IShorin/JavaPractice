package ru.IShorin.JavaPractice.laba11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Main_Game {
    public static void main(String[] args) {

        new Game();

    }
}

 class Game extends JFrame {
    public int number;
    public int quantity_iterations=0;
    public int result=0;
    public Game() {
        super();
        Random rnd = new Random();
        number = rnd.nextInt(20);
        JFrame frame = new JFrame("GameTry");
        JButton button = new JButton("CHECK");
        JTextField bigField = new JTextField("", 25);
        bigField.setFont(new Font("Dialog", Font.PLAIN, 16));
        bigField.setHorizontalAlignment(JTextField.CENTER);
        bigField.setBackground(Color.lightGray);


        bigField.setBounds(27, 40, 150, 100);
        button.setBounds(200,40,150,100);

        frame.add(button);
        frame.add(bigField);

        JTextField textRes = new JTextField("", 20);
        frame.add(textRes);
        textRes.setFont(new Font("Dialog", Font.PLAIN, 20));
        textRes.setHorizontalAlignment(JTextField.CENTER);
        textRes.setBackground(Color.lightGray);
        textRes.setBounds(30, 170, 320, 30);
        frame.setSize(400,270);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(bigField.getText());
                if (input>number) {
                    textRes.setText("\n" +
                            "the number is larger ");
                    textRes.setBackground(Color.ORANGE);
                }
                else if (input<number) {
                    textRes.setText("number less");
                    textRes.setBackground(Color.cyan);
                }
                else if (input==number){
                    textRes.setText("You won!");
                    textRes.setBackground(Color.GREEN);
                    result=1;

                    button.setVisible(false);
                }
                quantity_iterations++;
                if ((quantity_iterations==3)&&(result!=1)) {
                    textRes.setText("You lost");
                    textRes.setBackground(Color.RED);

                    button.setVisible(false);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // dispose();
                System.exit(0);
            }
        };
        button.addActionListener(actionListener);

    }

}



