package com.github.setframework;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/25 22:21
 * @ Version 1.0
 */
public class Demo_List {
    public static void main(String[] args) {
        Demo1();
    }

    /**
     * List特有的遍历方式，因为它有索引
     */
    public static void Demo1() {
        List a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
