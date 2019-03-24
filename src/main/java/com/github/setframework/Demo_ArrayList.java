package com.github.setframework;

import java.util.ArrayList;
import java.util.Collection;

public class Demo_ArrayList {
	/**
	 * collettion 引用ArrayList的对象，collection是接口，不能被实例化
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		demo3();
	}

	public static void demo3() {
		Collection c = new ArrayList();
		((ArrayList) c).add("a");
		((ArrayList) c).add("b");
		((ArrayList) c).add("c");
		Collection c2 = new ArrayList();
		((ArrayList) c2).add("a");
		((ArrayList) c2).add("b");
		((ArrayList) c2).add("c");
		System.out.println(c.contains(c2));
		System.out.println(c.retainAll(c2));
	}

	public static void demo2() {
		Collection c = new ArrayList();
		((ArrayList) c).add("a");
		((ArrayList) c).add("b");
		((ArrayList) c).add("a");
		Collection c2 = new ArrayList();
		((ArrayList) c2).add("a");
		((ArrayList) c2).add("b");
		((ArrayList) c2).add("c");
		((ArrayList) c).add(c2);
		System.out.println(c);
		c.remove(c2);
		System.out.println(c);
		((ArrayList) c).addAll(c2);
		System.out.println(c);
		c.removeAll(c2);
		System.out.println(c);
	}

	public static void demo1() {
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
