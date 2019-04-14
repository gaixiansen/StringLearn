package com.github.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: MapFor
 * @Description: 利用entry遍历map
 * @Author:
 * @CreateDate: 2019/4/14 21:14
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 21:14
 * @UpdateRemark:
 * @Version: 1.0
 */
public class MapFor {
	public static void main(String[] args) {
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
