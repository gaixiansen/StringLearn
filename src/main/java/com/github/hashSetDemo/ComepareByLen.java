package com.github.hashSetDemo;

import java.util.Comparator;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/4/15 23:27
 * @ Version 1.0
 */
public class ComepareByLen implements Comparator<String> {
    public int compare(String o1, String o2) {
        //按照字符串的长度排序
        int num = o1.length()-o2.length();
        return num==0 ? o1.compareTo(o2):num;
    }
}
