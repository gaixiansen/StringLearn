package com.github.otherstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo04_ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\c.txt"));
        // 读取对象
        Person p1 =(Person) ois.readObject();
        Person p2 =(Person) ois.readObject();
//        Person p3 =(Person) ois.readObject();  //当文件读取到了末尾时出现EOFException
        System.out.println(p1);
        System.out.println(p2);

//        demo2();

    }

    /**
     * 反序列化对象 一次读取
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void demo2() throws IOException, ClassNotFoundException {
        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\b.txt"));
        // 将集合对象一次读取
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        // 打印对象
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
