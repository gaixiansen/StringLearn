package com.github.hashSetDemo;

import java.util.TreeSet;

/**
 * @ Author: 瞎驴
 * @ description: TreeSet的底层是二叉树，每次将要添加进来的值和之前已经存在了的值从树的根节点要做一一比较，返回值大于零排到右边，小于零排到左边，等于零去掉不要。
 * 。要实现按指定的顺序排列对象，被排序的对象得继承Comparable接口，并实现其中的CompareTo方法
 * @ Date: 2019/4/15 22:55
 * @ Version 1.0
 */
public class TreesetDemo {
    public static void main(String[] args) {
//        Demo1();
        Demo2();
    }

    /**
     * TreeSet有一种构造方法可以接受一个比较器来将对象按照指定的顺序排序，这里将字符串按照长度进行了排序
     */
    public static void Demo2() {
        TreeSet<String> ts1 = new TreeSet<String>(new ComepareByLen());
        ts1.add("jkl");
        ts1.add("jdddd");
        ts1.add("j");
        ts1.add("jklkdada");
        ts1.add("jklkd");
        System.out.println(ts1);
    }

    /**
     * 将学生对象先按年龄排序再按姓名排序
     */
    public static void Demo1() {
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student("zhangsan",23));
        ts.add(new Student("lisi",22));
        ts.add(new Student("zhaoliu",24));
        System.out.println(ts);
    }
}
