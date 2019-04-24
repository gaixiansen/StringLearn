package com.github.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: MapFor
 * @Description: 利用遍历map
 * @Author:
 * @CreateDate: 2019/4/14 21:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 21:14
 * @UpdateRemark:
 * @Version: 1.0
 */
public class MapFor {
	public static void main(String[] args) {
//		Demo1();
		Demo2();
	}

	/**
	 * 利用map.keySet()获取到key，再利用key去获取value
	 */
	public static void Demo2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("jack",23);
		map.put("rose",24);
		map.put("peter",25);
		Set<String> ks = map.keySet();
		System.out.println(ks);
		for (Iterator<String> iterator = ks.iterator(); iterator.hasNext(); ) {
			String key = iterator.next();
			System.out.println(key + "=" + map.get(key));
		}
	}

	/**
	 * 利用entry先拿到键值对对象遍历map
	 */
	public static void Demo1() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("jack", 23);
		map.put("rose", 24);
		map.put("peter", 25);
		Set<Map.Entry<String, Integer>> et = map.entrySet();
		System.out.println(et);
		for (Map.Entry<String, Integer> stringIntegerEntry : et) {
			System.out.println("key="+stringIntegerEntry.getKey()+",value=" + stringIntegerEntry.getValue());

		}
	}
}
