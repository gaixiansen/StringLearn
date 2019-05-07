package com.github.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.collections
 * @ClassName: Demo1
 * @Description: Collections工具类可以对集合进行一些操作，如排序，倒序等
 * @Author:
 * @CreateDate: 2019/5/6 22:36
 * @UpdateUser:
 * @UpdateDate: 2019/5/6 22:36
 * @UpdateRemark:
 * @Version: 1.0
 */
public class Demo{
	public static void main(String[] args) {
		Demo1();
		Demo2();
		Demo3();
	}

	/**
	 * 二分法查找
	 */
	public static void Demo3() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("c");
		al.add("a");
		al.add("f");
		al.add("e");
		System.out.println(Collections.binarySearch(al, "f"));
	}

	/**
	 * 倒序
	 */
	public static void Demo2() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("c");
		al.add("a");
		al.add("f");
		al.add("e");
		Collections.reverse(al);
		System.out.println(al);
	}

	/**
	 * 排序
	 */
	public static void Demo1() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("c");
		al.add("a");
		al.add("f");
		al.add("e");
		Collections.sort(al);
		System.out.println(al);
	}
}
