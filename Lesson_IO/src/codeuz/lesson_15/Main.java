package codeuz.lesson_15;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        PrintWriter printWriter = new PrintWriter("bir.txt");
//        File file = new File("bir.txt");
//        PrintWriter printWriter = new PrintWriter(file);

//        File file = new File("bir.txt");
//        FileWriter fileWriter = new FileWriter(file,true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);


//        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File("bir.txt"))));
//        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File("bir.txt"), true)));

//        PrintWriter aaa = new PrintWriter(printWriter);

        File file = new File("bir.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Salom do'stlar");
        printWriter.print(65);
        printWriter.println();
        printWriter.print("Test");


        printWriter.flush();
        printWriter.close();


    }
}
