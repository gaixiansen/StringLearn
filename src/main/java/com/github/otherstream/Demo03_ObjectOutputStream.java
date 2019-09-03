package com.github.otherstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 序列化，将对象序列化后写入文件，对象必须实现Serializable接口
 */
public class Demo03_ObjectOutputStream {

    public static void main(String[] args) throws IOException {
        demo1();
//        demo2();

    }

    /**
     * 逐个写入对象
     * @throws IOException
     */
    public static void demo1() throws IOException {
        Person p1 = new Person("张三", 23);
        Person p2 = new Person("李四", 24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\c.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);

        oos.close();
    }

    /**
     * 将对象放入集合中一次写入
     * @throws IOException
     */
    public static void demo2() throws IOException {
        // 创建一个对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\JavaCode\\StringLearn\\src\\main\\java\\com\\github\\otherstream\\b.txt"));
        // 创建一个集合来存储Person对象
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("jack", 12));
        personArrayList.add(new Person("rose", 13));
        // 将对象集合写入文件中去
        oos.writeObject(personArrayList);
        oos.close();
    }
}
