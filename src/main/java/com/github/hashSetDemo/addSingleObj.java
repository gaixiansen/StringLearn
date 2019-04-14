package com.github.hashSetDemo;

import java.util.HashSet;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.hashSetDemo
 * @ClassName: addSingleObj
 * @Description: 添加独立的自定义对象到hashSet,需要重写添加对象的hashcode和equals方法
 * @Author:
 * @CreateDate: 2019/4/14 17:38
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 17:38
 * @UpdateRemark:
 * @Version: 1.0
 */
public class addSingleObj {
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<Person>();
		hs.add(new Person("jack", 23));
		hs.add(new Person("jack", 23));
		hs.add(new Person("rose", 24));
		hs.add(new Person("rose", 24));
		System.out.println(hs);

	}

}
