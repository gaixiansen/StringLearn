package com.github.MapDemo;

import java.util.HashMap;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: Demo_HashMapHashMap
 * @Description: hashmap的嵌套
 * @Author:
 * @CreateDate: 2019/5/6 21:55
 * @UpdateUser:
 * @UpdateDate: 2019/5/6 21:55
 * @UpdateRemark:
 * @Version: 1.0
 */
public class Demo_HashMapHashMap {
	public static void main(String[] args) {
		//一个hashmap中放入学生的信息
		HashMap<Student, String> hm01 = new HashMap<Student, String>();
		hm01.put(new Student("jack", 23), "Beijing");
		hm01.put(new Student("rose", 24), "Henan");
		hm01.put(new Student("peter", 25), "Tianjin");

		HashMap<Student, String> hm02 = new HashMap<Student, String>();
		hm02.put(new Student("Stdeven", 23), "Beijing");
		hm02.put(new Student("polo", 24), "Henan");
		hm02.put(new Student("James", 25), "Tianjin");
		HashMap<HashMap<Student, String>, String> hm = new HashMap<HashMap<Student, String>, String>();
		hm.put(hm01, "一班");  //将一个班作为一个对象放入一个新的hashmap中
		hm.put(hm02, "二班");
		for (HashMap<Student, String> h : hm.keySet()) {
			String classNum = hm.get(h); //拿到每个班级的班级号
			for (Student s : h.keySet()) {
				String address = h.get(s); //拿到每个学生的住址
				System.out.println("name=" + s.getName() + ",address=" + address + ",classNum=" + classNum);

			}

		}

	}
}
