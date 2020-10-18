package ru.IShorin.JavaPractice.laba12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.StrictMath.pow;


public class laba12 extends JFrame {
    public static void main(String []args){
        System.out.println(Planet.EARTH.getForce());
    }
}


class Planets extends JFrame{
    public static void main(String []args){
        new Planets();
    }
    public Planets(){
        JFrame frame = new JFrame();
        frame.setSize(500,250);
        JPanel panel = new JPanel();


        JButton button = new JButton("Accept");
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(300,300,50,50);
        panel.add(button);

        JTextField textField = new JTextField(15);
        textField.setBounds(10,10,100,50);
        textField.setToolTipText("Write the Planet");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Planets.this,"g = " + texthandler(textField.getText()));
            }
        });
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String texthandler(String str){
        switch (str){
            case "Earth": {
                str = String.valueOf(Planet.EARTH.getForce());
                break;
            }
            case "Mercury":{
                str = String.valueOf(Planet.MERCURY.getForce());
                break;
            }
            case "Venusian":{
                str = String.valueOf(Planet.VENUSIAN.getForce());
                break;
            }
            case "Mars":{
                str = String.valueOf(Planet.MARS.getForce());
                break;
            }
            case "Jovian":{
                str = String.valueOf(Planet.JOVIAN.getForce());
                break;
            }
            case "Saturn":{
                str = String.valueOf(Planet.SATURN.getForce());
                break;
            }
            case "Uranium":{
                str = String.valueOf(Planet.URANIUM.getForce());
                break;
            }
            case "Neptune":{
                str = String.valueOf(Planet.NEPTUNE.getForce());
                break;
            }
            case "":{
              return "empty line";

            }
        }
        return str;
    }
}
enum Planet{

    SATURN(5342190,5600),
    URANIUM(1249,13134),
    VENUSIAN(47,452),
    EARTH(4557,234),
    JOVIAN(1240,9998),
    MARS(1342,6134),
    MERCURY(389.9,2456),
    NEPTUNE(12440,3450);
    private int rad;
    private double mas;
    Planet(double mass, int radius){
        rad=radius;
        mas=mass;
    };

    public void setMass(double mass) {
        mas = mass;
    };

    public void setRadius(int radius) {
        rad = radius;
    };

    public double getMass() {
        return mas;
    };

    public int getRadius() {
        return rad;
    };
    public double getForce(){
        return 6.67*(mas*(pow(10,6)))/(pow(rad,2));
    }
}