package com.github.regex;

public class Demo2_regex {
	// "我我.....爱爱爱..编.编...程.程"   ->我爱编程
	public static void main(String[] args) {
		String s = "我我.....爱爱爱..编.编...程.程";
		String regex = "\\.";
		String s1 = s.replaceAll(regex, "");
		System.out.println(s1);
		String regex1 = "(.)\\1+";
		String s2 = s1.replaceAll(regex1, "$1");
		System.out.println(s2);
	}
}
