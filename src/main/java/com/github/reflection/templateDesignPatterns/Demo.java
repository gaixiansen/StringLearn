package com.github.reflection.templateDesignPatterns;


/**
 * 可以写不同的功能代码
 */
public class Demo extends GetTime{
    public void code() {
        int i = 0;
        while (i < 1000000){
            i++;
            System.out.println("ok");
        }
    }
}
