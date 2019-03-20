package com.github.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1_regex {
	public static void main(String[] args) {
		// 匹配出一个字符串中的电话号码
		String s = "我的手机号是15667879906，我曾经用过13467865648，现在用的是17845673342就是这样";
		String regex = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		ArrayList<String> result = new ArrayList<String>();
		while (m.find()){
			result.add(m.group());
		}
		for (String phone:
		     result) {
			System.out.println(phone);

		}

	}
}
