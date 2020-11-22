package ru.IShorin.JavaPractice.laba22;

import java.util.Scanner;

class Calendar {
    private String time;
    private String hours;
    private String minutes;

    public Calendar(String time) {
        this.time = time;
        date_handler();
    }
    public void date_handler(){
        String[] tmp = time.split(">");
        char[] tmp1 = tmp[0].toCharArray();
        hours = tmp1[1] + String.valueOf(tmp1[2]);
        tmp1 = tmp[1].toCharArray();
        minutes = String.valueOf(tmp1[1]) + tmp1[2];
    }

    @Override
    public String toString() {
        return "Time {" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
 class Date {
    private String date;
    private String day, month, year;

    public Date(String date) {
        this.date = date;
        date_handler();
    }

    @Override
    public String toString() {
        return "Date {" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void date_handler(){
        String[] tmp = date.split(">");
        char[] chars = tmp[0].toCharArray();
        day = String.valueOf(chars[1]) + chars[2];
        chars = tmp[1].toCharArray();
        month = String.valueOf(chars[1]) + chars[2];
        chars = tmp[2].toCharArray();
        year = String.valueOf(chars[1]) + chars[2] + chars[3] + chars[4];
    }
}
 class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: день, месяц, год");
        Date date = new Date(scanner.nextLine());
        System.out.println("Введите время: часы, минуты");
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
        System.out.println(date.toString());
    }
}
