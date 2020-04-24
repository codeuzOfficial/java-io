package codeuz.lesson_13;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        FileWriter fileWriter = new FileWriter("bir.txt", true);
        FileWriter fileWriter = new FileWriter("bir.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bir.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("bir.txt")));


        //BufferedWriter aaaa = new BufferedWriter(bufferedWriter);


        bufferedWriter.write(65);
        bufferedWriter.write('D');
        bufferedWriter.write("65");

        bufferedWriter.newLine();
        bufferedWriter.write("abcd");

        bufferedWriter.newLine();
        bufferedWriter.write(new char[]{'A', 'B', 'C'});


        bufferedWriter.flush();
        bufferedWriter.close();


    }
}
