package com.github.setframework;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.name.equals(s.name) &&  (this.age == s.age);
	}
}
