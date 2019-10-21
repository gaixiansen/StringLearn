package com.github.reflection;

import com.github.reflection.bean.Apple;
import com.github.reflection.bean.Juicer;
import com.github.reflection.bean.Oranage;
import com.github.reflection.bean.Person;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    /**
     * 多态
     */
    @Test
    public void test1(){
        Apple apple = new Apple();
        Oranage oranage = new Oranage();
        Juicer juicer = new Juicer();
        juicer.run(apple);
        juicer.run(oranage);
    }

    /**
     * 反射实现动态的榨汁需求
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void test2() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/github/reflection/config.properties")); //读取配置文件
        Class<?> classz = Class.forName(br.readLine());//获取该类的字节码文件
        Fruit fruit = (Fruit) classz.newInstance();//得到这个类对象的实例
        Juicer juicer = new Juicer(); //得到榨汁机对象
        juicer.run(fruit);
        Person person = new Person();
        person.eat();
    }

}
