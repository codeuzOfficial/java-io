package codeuz.lesson_4;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //  File (any type (.txt,.pdf, )  Folder ())

        File file = new File("123.txt");

       // System.out.println(file.exists());
        /*
        boolean answer = file.createNewFile();
        System.out.println(answer);
        */

       /* if (!file.exists()) {
            boolean answer = file.createNewFile();
            System.out.println(answer);
        } */

       /*
        boolean answer = file.delete();
        System.out.println(answer);
        */

       // System.out.println(file.isFile());

    }
}
