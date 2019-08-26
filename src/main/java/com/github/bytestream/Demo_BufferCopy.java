package com.github.bytestream;

import java.io.*;

public class Demo_BufferCopy {
    public static void main(String[] args) throws IOException {
        demo1();

    }

    /**
     ** A:缓冲思想
     * 	* 字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
     * 	* 这是加入了数组这样的缓冲区效果，java本身在设计的时候，
     * 	* 也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
     * * B.BufferedInputStream
     * 	* BufferedInputStream内置了一个缓冲区(数组)
     * 	* 从BufferedInputStream中读取一个字节时
     * 	* BufferedInputStream会一次性从文件中读取8192个, 存在缓冲区中, 返回给程序一个
     * 	* 程序再次读取时, 就不用找文件了, 直接从缓冲区中获取
     * 	* 直到缓冲区中所有的都被使用过, 才重新从文件中读取8192个
     * * C.BufferedOutputStream
     * 	* BufferedOutputStream也内置了一个缓冲区(数组)
     * 	* 程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
     * 	* 直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
     * * D.拷贝的代码
     * @throws IOException
     */
    public static void demo1() throws IOException {
        BufferedInputStream fi = new BufferedInputStream(new FileInputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\bytestream\\1.txt"));
        BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\bytestream\\copy1.txt"));
        int b;
        while ((b = fi.read()) != -1){
            fo.write(b);
        }
        fi.close();
        fo.close();
    }
}
