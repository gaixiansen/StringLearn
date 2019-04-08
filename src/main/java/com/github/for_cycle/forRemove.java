package com.github.for_cycle;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ Author: 瞎驴
 * @ description:三种for删除方法
 * @ Date: 2019/4/8 21:42
 * @ Version 1.0
 */
public class forRemove {
    public forRemove() {
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("e");
//        Demo1(list);
//        Demo2(list);
        for (String s:
             list) {
            if ("b".equals(s));
//            list.remove("b");  //会引发并发修改异常，因为foreach底层是迭代器
        }

    }

    /**
     * @description: 使用迭代器删除元素，注意不能使用原list中的remove方法，否则会引发并发修改异常
     * @param list
     */
    public static void Demo2(ArrayList<String> list) {
        Iterator it = list.iterator();
        while (it.hasNext()){
            if ("b".equals(it.next())){
//                list.remove("b");//会引发并发修改异常
                it.remove();
            }
        }
        System.out.println(list);
    }

    /**
     * 在删除一个元素后指针需要后退，因为后面的元素会往前补上
     */
    public static void Demo1(ArrayList<String> list) {
        for (int i=0; i<list.size(); i++){
            if ("b".equals(list.get(i))){
                list.remove(i--);
            }
        }
        System.out.println(list);
    }
}
