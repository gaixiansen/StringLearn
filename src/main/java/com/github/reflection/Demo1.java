package com.github.reflection;

import com.github.reflection.bean.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        // 用法一：通过一个对象获得完整的包名和类名
        Person p = new Person("jack", 23);
        Class<?> aClass = p.getClass(); // 获取类对象
        System.out.println(aClass.getName());//获取类名


        // 用法二：实例化Class类的对象
        Class<?> aClass1 = Class.forName("com.github.reflection.bean.Person");  //获取类对象
        Class<?> aClass2 = new Person("peter", 24).getClass();
        System.out.println(aClass1);
        System.out.println(aClass2);


        // 用法八：通过反射调用其他类中的方法(JDK动态代理)
        Method method = aClass1.getMethod("setName", String.class);
        Person o = (Person) aClass1.newInstance();
        Object peter = method.invoke(o, "peter");
        System.out.println(o.getName());
    }
}
