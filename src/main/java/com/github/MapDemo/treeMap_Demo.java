package com.github.MapDemo;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: treeMap_Demo
 * @Description: 添加自定义对象，通过重写对象的equals和hashcode方法来按照自己的要求去比较并且去排序（treeMap特有的），不重写的话因为要添加的对象的地址是不同的，
 * 所以不会达到去重的效果，这里说的比较都是针对键的
 * @Author:
 * @CreateDate: 2019/4/14 22:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 22:40
 * @UpdateRemark:
 * @Version: 1.0
 */
public class treeMap_Demo {
	public static void main(String[] args) {
//		Demo1();
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				int num = o1.getAge()-o2.getAge();
				return num == 0 ? o1.getName().compareTo(o2.getName()) : num; //先按照年龄去编比较，再按姓名比较
			}
		});
		tm.put(new Student("aaa",23), "111");
		tm.put(new Student("aaa",23), "111");
		tm.put(new Student("ccc",22), "333");
		tm.put(new Student("bb",22), "333");
		tm.put(new Student("bbb",24), "222");
		tm.put(new Student("bbb",24), "222");
		System.out.println(tm);
	}

	/**
	 * 通过重写对象的equals和hashcode方法，并且实现Comparable接口来按照自己的要求去比较并且去排序
	 */
	public static void Demo1() {
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
