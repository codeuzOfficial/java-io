package codeuz.lesson_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("bir.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("bir.txt", true);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("bir.txt"));
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("bir.txt"), true);

        fileOutputStream.write(65); // A B a97
        fileOutputStream.write(97); // A B a97

        fileOutputStream.flush();
        fileOutputStream.close();



    }
}
