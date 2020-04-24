package codeuz.lesson_10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // FileWriter fileWriter = new FileWriter("bir.txt");

//        File file = new File("bir.txt");
//        FileWriter fileWriter = new FileWriter(file);

//        FileWriter fileWriter = new FileWriter("bir.txt", true);

        File file = new File("bir.txt");
        FileWriter fileWriter = new FileWriter(file, true);

        fileWriter.write('A');
        fileWriter.write(66);

        // fileWriter.write('\n');

        String line = System.getProperty("line.separator");

        fileWriter.write(line);

        fileWriter.write("Salom");

        fileWriter.write(line);

        char[] c = new char[]{'a', 'b', 'c', 'd'};
        fileWriter.write(c);

        fileWriter.write(line);
        fileWriter.write("12345678", 1, 3);


        fileWriter.flush();
        fileWriter.close();
    }
}
