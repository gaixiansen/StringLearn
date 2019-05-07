package com.github.exception;

import java.util.ArrayList;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/5/7 23:14
 * @ Version 1.0
 */
public class Demo1_Exeption {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("c");
        al.add("d");
        try {
            System.out.println(al.get(12));
            System.out.println(1/0);
        }catch (IndexOutOfBoundsException e){ // 一个try在捕获一个异常时便会进入catch，后面的异常代码不会执行
            e.printStackTrace();
        }catch (Exception f){   //多个catch存在时大的异常应该写在小异常后面
            System.out.println("error");
        }
    }
}
