package com.github.random;

import java.util.Random;

public class Demo1_random {
	public static void main(String[] args) {
		Random r = new Random(100);
		for (int i=0;i<10;i++) {
			System.out.println(r.nextInt(100));
		}
		System.out.println(r.nextFloat());

	}
}
