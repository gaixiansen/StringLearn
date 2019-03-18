package com.github.StringBuffer;

import java.util.Scanner;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/17 21:17
 * @ Version 1.0
 */
public class Demo3_StringBuffer {
    public static void main(String[] args) {
        System.out.println("please input a String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = strReverse(s1);
        System.out.println(s2);
    }

    public static String strReverse(String line){
        StringBuffer sb = new StringBuffer(line);
        sb.reverse();
        return sb.toString();
    }
}
