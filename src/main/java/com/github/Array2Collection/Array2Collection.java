package com.github.Array2Collection;

import java.util.Arrays;
import java.util.List;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/4/8 22:43
 * @ Version 1.0
 */
public class Array2Collection {
    public static void main(String[] args) {
//        Demo2_Application();
//        Demo1();
        Demo3();
    }

    /**
     * 将数组转换为集合，数组必须是引用数据类型
     */
    public static void Demo3() {
        Integer[] a = {1,2,3};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);
    }

    /**
     * 基本数据类型转化为集合时，会将整个数组作为一个引用对象来存储，集合中只能存储引用数据类型
     * Java中的字符串String属于引用数据类型。因为String是一个类
     */
    public static void Demo2() {
        int[] a = {1,2,3};
        List<int[]> list = Arrays.asList(a);
        System.out.println(list);
    }

    /**
     * 数组转换为集合时，可以调用除add 和 remove其他的方法
     */
    public static void Demo1() {
        String[] s = {"a","b","c"};
        List<String> list1 = Arrays.asList(s);
        System.out.println(list1.get(1));
        System.out.println(list1);
    }
}
