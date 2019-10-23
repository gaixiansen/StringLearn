package com.github.reflection;

import com.github.reflection.bean.*;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo2_Application {
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

    /**
     * 反射实现取消泛型的限制
     * 分析：泛型只在类的编译时期有效，在运行期无效
     */
    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Class<?> aClass = Class.forName("java.util.ArrayList"); //获取类的字节玛对象
        Method m = aClass.getDeclaredMethod("add", Object.class); //获取ArrayList的add方法
        m.invoke(list,"java");
        System.out.println(list);

    }

    /**
     * 修改一个对象属性值
     * 传统方法要求对象必须要set方法
     */
    @Test
    public void test4(){
        Person jack = new Person("jack", 23);
        System.out.println("before modify:" + jack.getName());
        jack.setName("rose");
        System.out.println("after modify:" + jack.getName());
    }

    /**
     * 利用反射，即使对象没有set方法，依然能改变对象属性的值
     */
    @Test
    public void test5() throws NoSuchFieldException, IllegalAccessException {
        Student jack = new Student("jack", 23);
        Class<? extends Student> aClass = jack.getClass();
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("before modify:" + jack.getName());
        field.set(jack, "rose");
        System.out.println("after modify:" + jack.getName());
    }
}
