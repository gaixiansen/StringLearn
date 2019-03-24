package com.github.setframework;

public class Demo1 {
	public static void main(String[] args) {
		Student[] arry = new Student[5];
		for (int i=0; i<arry.length;i++) {
			arry[i] = new Student("jack_"+ (int) (Math.random()*10), 23);
			System.out.println(arry[i].toString());
		}
		System.out.println(arry.length);
		for(int i=0; i<arry.length;i++){
			System.out.println(arry[i]);
		}
	}
}
