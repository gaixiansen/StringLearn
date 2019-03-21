package com.github.typeChange;

public class Demo1_typeChange {
	public static void main(String[] args) {
		int a = 10;
		System.out.println((double) a);
		System.out.println(Integer.toString(a));
		System.out.println(String.valueOf(a));
		double b = 1.08;
		System.out.println((int) b);
		String C = "123";
		System.out.println(Integer.parseInt(C));


	}
}
