package codeuz.lesson_14;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("bir.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


//        int n = bufferedReader.read();
//
//        while ((n = bufferedReader.read()) != -1) {
//            System.out.println((char) n);
//        }


        String line;


        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }
}
