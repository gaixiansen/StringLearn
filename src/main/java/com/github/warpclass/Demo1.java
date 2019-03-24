package com.github.warpclass;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/18 20:55
 * @ Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        String a = Integer.toBinaryString(60);
        System.out.println("60=" + a);
        Byte b = Byte.parseByte("101", 2);
        System.out.println(b);
    }
}
