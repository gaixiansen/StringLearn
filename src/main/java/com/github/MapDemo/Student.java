package com.github.MapDemo;

import java.util.Objects;

/**
 * @ProjectName: JavaLearn
 * @Package: com.github.MapDemo
 * @ClassName: StudentImpl
 * @Description:
 * @Author:
 * @CreateDate: 2019/4/14 22:40
 * @UpdateUser:
 * @UpdateDate: 2019/4/14 22:40
 * @UpdateRemark:
 * @Version: 1.0
 */
public class Student implements Comparable<Student>{
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentImpl{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;
		Student student = (Student) o;
		return age == student.age &&
			name.equals(student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	public int compareTo(Student o) {
		int num = this.age-o.age; //先按年龄来比，再按姓名比较
		return num==0? this.name.compareTo(o.name):num;
	}
}
