package com.github.hashSetDemo;

/**
 * @ Author: 瞎驴
 * @ description:
 * @ Date: 2019/4/15 22:57
 * @ Version 1.0
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //实现了Comparator接口中的compareTo方法
    public int compareTo(Student o) {
        int num = this.age - o.age;      //先按年龄排序，再按姓名排序
        return num==0 ? this.name.compareTo(o.name):num;
    }
}
