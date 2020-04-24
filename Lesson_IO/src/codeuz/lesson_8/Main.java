package codeuz.lesson_8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
  /*
    // bytes in decimal (SI)
     1 Bit    ->  0/1
     1 Byte   = 8 Bits/bits |
     1 KByte  = 1000 Bytes/bytes -> 8,000 Bits
     1 MByte  = 1000 KBytes ->   1,000,000 Bytes -> 8,000,000 Bytes
     1 GByte  = 1000 MBytes -> 1,000,000 KBytes -> 1,000,000,000 Bytes -> 8,000,000,000 Bits
   */

  /*   // bytes in binary
     1 Byte = 8 Bits
     1 KB  = 1024 Bytes (2^10)
     1 MByte  = 1,048,576 Bytes (2^20)
     1 GByte = 1,073,741,824 bytes (2^30)
     1 TByte = 1,099,511,627,776 bytes (2^40)
   */


        File file = new File("bir.txt");
//        File file = new File("D:\\test");

        // file.createNewFile(); // yangi file yaratish
//        System.out.println(file.canRead()); // file ga yozsa bo'ladimi?
//        System.out.println(file.canWrite()); // yozish mumkinmi?

//        System.out.println(file.delete()); // delete
//        System.out.println(file.exists()); // shu file yokiy folder bormi?
//         System.out.println(file.getAbsolutePath()); // to'liq (Mutloq ) yo'l,

//        System.out.println(file.getFreeSpace()); // bytes // 213560737792
//        long n = file.getFreeSpace();
//        long m = 1073741824L;

//        System.out.println(n / m);
//        System.out.println(file.getName()); // get_name
//        System.out.println(file.getParent()); //
//        System.out.println(file.getParentFile()); //
//        System.out.println(file.getPath());

//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.isHidden());
//        System.out.println(file.isAbsolute());

//        System.out.println(file.length()); // file size

//        String[] s = file.list();
//        File[] f = file.listFiles();


    }

}
