package com.github.exception;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/5/7 23:41
 * @ Version 1.0
 */
public class Person {
    int age;
    String name;

    public Person() {
    }

    public void setAge(int age) throws Exception {  //方法可能存在编译异常，所以要声明，抛出运行时异常RuntimeException时，可以不声明
        if (age>120 || age<=0){
            throw new Exception("年龄不合法"); //设置年龄不合法时抛出异常
        }else{
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
