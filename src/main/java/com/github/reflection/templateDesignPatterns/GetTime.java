package com.github.reflection.templateDesignPatterns;

/**
 * 专门统计时间的抽象类，采用模板设计思想
 */
abstract public class GetTime {
     public final Long getTime(){
         long startTime = System.currentTimeMillis();
         //调用功能代码
         code();
         long endTime = System.currentTimeMillis();
         return endTime-startTime;
     }

    /**
     * 定义成抽象类让子类去具体的实现
     */
    public abstract void code();
}
