package com.github.hashSetDemo;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.hashSetDemo
 * @ClassName: getSingleList
 * @Description: 利用Linkedhashset对list去重
 * @Author:
 * @CreateDate: 2019/4/14 20:03
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 20:03
 * @UpdateRemark:
 * @Version: 1.0
 */
public class getSingleList {
	public static void main(String[] args) {
		ArrayList<String> lt = new ArrayList<String>();
		lt.add("a");
		lt.add("a");
		lt.add("a");
		lt.add("b");
		lt.add("b");
		lt.add("c");
		lt.add("c");
		lt.add("c");
		lt.add("c");
		ArrayList<String> ltSingle = getSingle(lt);
		System.out.println(ltSingle);
	}

	public static ArrayList<String> getSingle(ArrayList<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
		return list;
	}
}
