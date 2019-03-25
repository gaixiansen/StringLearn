package com.github.setframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ Author: 瞎驴
 * @ Date: 2019/3/25 22:25
 * @ Version 1.0
 */
public class Demo_iter {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
