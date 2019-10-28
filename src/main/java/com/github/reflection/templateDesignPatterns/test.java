package com.github.reflection.templateDesignPatterns;


/**
 * 测试一个功能的运行时间
 */
public class test {
    public static void main(String[] args) {
//        t1();
        t2();


    }

    /**
     * 采用模板设计思想,将功能实现代码解耦出来，增加了代码的适用性
     */
    public static void t2() {
        Demo demo = new Demo();
        Long allTime = demo.getTime();
        System.out.println(allTime);
    }

    /**
     * 传统的测试方法
     */
    public static void t1() {
        long startTime = System.currentTimeMillis();
        // 功能代码
        for (int i = 0; i < 1000000; i++) {
            System.out.println("ok");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("allTime:" + (endTime-startTime));
    }
}
