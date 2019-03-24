package com.github.setframework;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	/**
	 * collettion 引用ArrayList的对象，collection是接口，不能被实例化
	 * @param args
	 */
	public static void main(String[] args) {
		Collection al = new ArrayList<Student>();
		al.add(new Student("JACK", 34));
		al.add(new Student("PETER", 23));
		al.add(new Student("ROSE", 23));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		((ArrayList) al).remove(2);
		//转化成数组进行遍历
		Object[] al1 = al.toArray();
		for (int i=0;i<al1.length;i++){
			//多态的弊端，父类不能引用子类私有的属性，所以得向下转型
			Student s = (Student) al1[i];
			System.out.println(s.getName() + ":" + s.getAge() );
		}


	}
}
