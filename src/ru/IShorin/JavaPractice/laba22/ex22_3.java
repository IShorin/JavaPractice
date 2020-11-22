package ru.IShorin.JavaPractice.laba22;

import java.util.Date;
import java.util.Scanner;

class ex22_3 {
    private String surname;
    private Date getDateOfTask;
    private Date getDateOfFinishTask;
    public String InputFio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Surname ");
        surname = scanner.nextLine();
        return surname;
    }
    public void getDateOfBeginTask() {
        Date getDateOfTask = new Date();
        Long time = getDateOfTask.getTime();
        long anotherDate = -7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate); //неделю назад
        getDateOfTask = new Date(time);
        System.out.println("Task received: " + getDateOfTask);
    }
    public void getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        System.out.println("Task completed: " + getDateOfFinishTask);
    }
    public static void main(String[] args) {
        ex22_3 devInf = new ex22_3();
        String surname = devInf.InputFio();
        System.out.println("Developers Surname is " + surname);
        devInf.getDateOfBeginTask();
        devInf.getDateOfFinishTask();
    }
}