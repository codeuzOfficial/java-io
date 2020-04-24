package codeuz.lesson_11;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


//        File file = new File("bir.txt");
//        FileReader fileReader = new FileReader(file);

        FileReader fileReader = new FileReader("bir.txt");


        int n = fileReader.read();

        while (n != -1) {
            System.out.print((char) n);
            n = fileReader.read();
        }

        fileReader.close();

    }
}
