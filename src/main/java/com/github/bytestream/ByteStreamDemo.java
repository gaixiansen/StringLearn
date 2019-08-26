package com.github.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        demo3();
    }

    /**
     * 使用数组完成文件的拷贝
     * @throws IOException
     */
    public static void demo3() throws IOException {
        FileInputStream fis = new FileInputStream("致青春.mp3");
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        byte[] arr = new byte[8192];
        int len;
        while((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);
        }

        fis.close();
        fos.close();
    }

    public static void demo2() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        FileOutputStream fos = new FileOutputStream("yyy.txt");
        byte[] arr = new byte[2];

        int len;
        while((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);  //如果忘记加arr,返回的就不是读取的字节个数,而是字节的码表值
        }

        fis.close();
        fos.close();
    }

    public static void demo1() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        byte[] arr = new byte[2];
        int a = fis.read(arr);
        System.out.println(a);
        byte[] var6 = arr;
        int var5 = arr.length;

        for(int var4 = 0; var4 < var5; ++var4) {
            byte b = var6[var4];
            System.out.println(b);
        }

        System.out.println("-----------------------");
        int c = fis.read(arr);
        System.out.println(c);
        byte[] var7 = arr;
        int var10 = arr.length;

        for(var5 = 0; var5 < var10; ++var5) {
            byte b = var7[var5];
            System.out.println(b);
        }

        fis.close();
    }
}
