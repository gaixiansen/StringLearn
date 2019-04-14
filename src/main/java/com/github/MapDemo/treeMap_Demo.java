package com.github.MapDemo;

import java.util.TreeMap;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: treeMap_Demo
 * @Description:
 * @Author:
 * @CreateDate: 2019/4/14 22:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 22:40
 * @UpdateRemark:
 * @Version: 1.0
 */
public class treeMap_Demo {
	public static void main(String[] args) {
		TreeMap<Student,String> tm = new TreeMap<Student,String>();
		tm.put(new Student("aaa",23), "111");
		tm.put(new Student("aaa",23), "111");
		tm.put(new Student("ccc",22), "333");
		tm.put(new Student("bb",22), "333");
		tm.put(new Student("bbb",24), "222");
		tm.put(new Student("bbb",24), "222");
		System.out.println(tm);
	}
}
