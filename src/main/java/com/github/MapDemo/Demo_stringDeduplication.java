package com.github.MapDemo;

import java.util.HashMap;

/**
 * @ Author: 瞎驴
 * @ description:利用hashmap键的唯一性统计一个字符串中字符出现的次数
 * @ Date: 2019/4/24 22:55
 * @ Version 1.0
 */
public class Demo_stringDeduplication {
    public static void main(String[] args) {
        String s = "aaabbbbccccddddddd";
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char c:chars) {
            hm.put(c, !hm.containsKey(c)? 1:hm.get(c)+1);
        }
        for (Character c : hm.keySet()) {
            System.out.println(c + "=" + hm.get(c));
        }
    }
}
