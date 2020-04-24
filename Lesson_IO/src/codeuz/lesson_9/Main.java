package codeuz.lesson_9;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("bir.txt");


        fileWriter.write('A');

        fileWriter.flush();
        fileWriter.close();


    }
}
