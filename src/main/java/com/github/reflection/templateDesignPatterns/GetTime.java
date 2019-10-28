package com.github.reflection.templateDesignPatterns;

/**
 * 专门统计时间的抽象类，采用模板设计思想
 * * A:模版设计模式概述
 * 	* 模版方法模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
 * * B:优点和缺点
 * 	* a:优点
 * 		* 使用模版方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求
 * 	* b:缺点
 * 		* 如果算法骨架有修改的话，则需要修改抽象类
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
