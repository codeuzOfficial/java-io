package codeuz.lesson_12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("bir.txt");
        FileReader fileReader = new FileReader(file);

        //   FileReader fileReader = new FileReader("bir.txt");

      /*
        int n = fileReader.read();

        while (n != -1) {
            System.out.print((char) n);
            n = fileReader.read();
        }
        */


      /*  int n;

        while ((n = fileReader.read()) != -1) {
            System.out.print((char) n);
        } */

 /*
        char[] c = new char[10];
        int n;

        while ((n = fileReader.read(c)) != -1) {
            System.out.println(c);
            System.out.println(n);
        }
*/
        System.out.println(file.length());
        char[] c = new char[(int) file.length()];

        int n = fileReader.read(c);
        System.out.println(c);
        System.out.println(n);


        fileReader.close();

    }
}
