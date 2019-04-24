package com.github.MapDemo;

import java.util.LinkedHashMap;

/**
 * @ Author: 瞎驴
 * @ description:LinkedHashMap会保存添加的先后顺序
 * @ Date: 2019/4/24 22:29
 * @ Version 1.0
 */
public class Demo_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Student, String> lhm = new LinkedHashMap<Student, String>();
        lhm.put(new Student("zhangsan",23), "shanghai");
        lhm.put(new Student("zhangsan",23), "shanghai");
        lhm.put(new Student("wangwu",25), "shanghai");
        lhm.put(new Student("wangwu",25), "shanghai");
        lhm.put(new Student("lisi",24), "shanghai");
        lhm.put(new Student("lisi",24), "shanghai");
        System.out.println(lhm);
    }
}
