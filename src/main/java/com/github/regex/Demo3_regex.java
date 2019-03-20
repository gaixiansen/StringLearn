package com.github.regex;

public class Demo3_regex {
	// 以重叠的字符串分割此字符串    "qweqqhujkkkkuinppppihju"
	public static void main(String[] args) {
		String s  = "qweqqhujkkkkuinppppihju";
		String[] result = s.split("(.)\\1+");
		for (String a:
		     result) {
			System.out.println(a);
		}
	}
}
