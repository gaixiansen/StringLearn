package com.github.otherstream;


import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02_ByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fi = new FileInputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\a.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 创建一个内存字节输出流
        int b;
        while ((b = fi.read()) != -1){
            baos.write(b);           //将读取的数据字节流逐个写入到内存字节流中去
        }
        System.out.println(baos.toString()); //将缓冲区的内容转换为了字符串,在输出语句中可以省略调用toString方法
        fi.close();
        // 由于内存字节流不是建立内存和硬盘之间的通道，所以不用关

    }

    /**
     * 字节流读取utf-8中文，如果不按照utf-8的三个字节编码要求去读，会出现乱码
     * @throws IOException
     */
    public static void demo1() throws IOException {
        FileInputStream fi = new FileInputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\a.txt");
        byte[] array = new byte[2];
        int b;
        while ((b = fi.read(array)) != -1){
            System.out.println(new String(array,0,b));
        }
    }

}
