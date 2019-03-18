package com.github.StringBuffer;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/17 20:44
 * @ Version 1.0
 */
public class Demo2_StringBuffer {
    public static void main(String[] args) {
        StringBuffer2String();
        String2StringBuffer();
    }

    private  static void StringBuffer2String(){
        StringBuffer sb = new StringBuffer("hello");
        String s1 = sb.toString();
        System.out.println(s1);
        String s2 = new String(sb);
        System.out.println(s2);
        String s3 = sb.substring(0, sb.length());
        System.out.println(s3);
    }

    private static void String2StringBuffer(){
        String a = "world";
//        StringBuffer sb = new StringBuffer();
//        sb.append(a);
//        System.out.println(sb);
        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb);

    }

}
