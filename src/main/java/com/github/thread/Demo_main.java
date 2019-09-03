package com.github.thread;

public class Demo_main {
    public static void main(String[] args) {
//        demo1();
        Demo2_Runnable d2 = new Demo2_Runnable();
        Thread t1 = new Thread(d2);
        t1.start();
        for (int i = 0; i < 10000; i++) {          // 主线程的代码
            System.out.println("bbbbbbbbbb");

        }                                           //结果是子线程和当主线程交替执行

    }

    /**
     * 继承Thread
     */
    public static void demo1() {
        Demo1_MyThread d1 = new Demo1_MyThread();
        d1.start(); // 启动单独的一个线程

        for (int i = 0; i < 10000; i++) {          // 主线程的代码
            System.out.println("b");

        }                                           //结果是子线程和当主线程交替执行
    }
}
