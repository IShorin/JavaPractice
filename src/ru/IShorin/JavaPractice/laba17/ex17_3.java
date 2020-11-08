package ru.IShorin.JavaPractice.laba17;

import java.io.*;

public class ex17_3 {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int i;

        while((i=fileInputStream.read())!= -1) {

            System.out.print((char) i);
        }
    }
}