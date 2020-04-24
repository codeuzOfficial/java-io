package codeuz.lesson_6;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("a");

//        System.out.println(file.exists());
//        if (!file.exists()) {
//         boolean result =  file.mkdir();
//            System.out.println(result);
//        }


//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

//        System.out.println(file.delete());


//        String[] subList = file.list();
//        for (String s : subList) {
//            File subFile = new File("a/" + s); // a/bir.txt
//
//            if (subFile.isFile()) {
//                System.out.println("Bu file " + s);
//            } else {
//                System.out.println("Bu folder " + s);
//            }
//        }

        File[] subFileList = file.listFiles();

        for (File subFile : subFileList) {

            if (subFile.isFile()) {
                System.out.println("Bu file " + subFile.getName());
            } else {
                System.out.println("Bu folder " + subFile.getName() + "  :  " + subFile.isHidden());
            }
        }
    }
}
