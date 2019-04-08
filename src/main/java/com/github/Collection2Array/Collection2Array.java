package com.github.Collection2Array;

import java.util.ArrayList;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/4/8 23:00
 * @ Version 1.0
 */
public class Collection2Array {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        String[] str1 = str.toArray(new String[0]);  //当数组的长度小于集合长度时，返回的数组长度等于集合长度
        for (int i = 0; i < str1.length; i++) {
            String s = str1[i];
            System.out.println(s);
        }
    }
}
