package ru.IShorin.JavaPractice.laba17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex17_4 {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        try (FileWriter writer = new FileWriter(file, true)){
            String str;
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            writer.write("\n");
            writer.write(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}