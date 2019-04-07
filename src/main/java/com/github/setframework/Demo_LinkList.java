package com.github.setframework;

import java.util.LinkedList;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.setframework
 * @ClassName: Demo_LinkList
 * @Description:
 * @Author:
 * @CreateDate: 2019/4/7 11:10
 * @UpdateUser:
 * @UpdateDate: 2019/4/7 11:10
 * @UpdateRemark:
 * @Version: 1.0
 */
public class Demo_LinkList {
	public Demo_LinkList() {
	}

	public static void main(String[] args) {
//		print();
		Demo2();
	}

	public static void Demo2() {
		Stack st = new Stack();
		st.in("a");
		st.in("b");
		st.in("c");
		while (!st.isEmpty()){
			System.out.println(st.out());
		}
	}

	/**
	 * 利用linkedlist模仿栈数据模型,先进后出
	 */
	public static void print() {
		LinkedList kl = new LinkedList();
		kl.addFirst("a");
		kl.addFirst("b");
		kl.addFirst("c");
		System.out.println(kl);
		System.out.println(kl.getFirst());
		System.out.println(kl.getLast());
		System.out.println(kl.get(2));
	}
}
