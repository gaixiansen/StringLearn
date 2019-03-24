package com.github.ArrayDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/18 20:33
 * @ Version 1.0
 */
public class Demo1_Arrays {

    public static void main(String[] args) {
        int[] a = {11,33,22,55,44};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int index = Arrays.binarySearch(a, 55);
        System.out.println("55=" + index);
    }
}
