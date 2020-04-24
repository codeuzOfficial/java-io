package codeuz.lesson_5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/test/bir.txt");

        System.out.println(file.exists());
//        System.out.println(file.createNewFile());

    }
}
