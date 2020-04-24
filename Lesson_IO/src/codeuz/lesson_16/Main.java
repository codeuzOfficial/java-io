package codeuz.lesson_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        FileInputStream fileInputStream = new FileInputStream("bir.txt");
        File file = new File("bir.txt");
        FileInputStream fileInputStream = new FileInputStream(file);


        int b;

        while ((b = fileInputStream.read()) != -1) {
            System.out.println((char) b);
        }


        fileInputStream.close();


    }
}
