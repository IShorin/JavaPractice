package ru.IShorin.JavaPractice.laba17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex17_1 {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        try (FileWriter writer = new FileWriter(file, false)){
            String str = "Test string";
            writer.write(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}