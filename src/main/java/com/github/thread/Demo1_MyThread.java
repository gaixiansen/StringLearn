package com.github.thread;


/**
 * 多线程的实现方式1 继承Thread
 */
public class Demo1_MyThread extends Thread{           //1、继承Thread
    @Override
    public void run() {                             // 2、重写run方法
        for (int i = 0; i < 100000; i++) {
            System.out.println("aaaaaaaaaaaaaa");
        }
    }
}
