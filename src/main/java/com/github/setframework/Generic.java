package com.github.setframework;

/**
 * @ Author: 瞎驴
 * @ description: 泛型在接口中的使用
 * @ Date: 2019/4/7 19:55
 * @ Version 1.0
 */

interface Tool<T>{
    public void show(T t);
}
class Generic implements Tool<String>{

    public static void main(String[] args) {
        Generic g = new Generic();
        g.show("abc");
    }
    public void show(String t) {
        System.out.println(t);
    }

}
