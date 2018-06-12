package com.itheima.spring.demo2;

import java.util.Date;

public class Student {
	private String name;
	private int age;
	private Date brithday;
	private Dog dog;

	public Student(String name, int age, Date brithday, Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.brithday = brithday;
		this.dog = dog;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, Date brithday) {
		super();
		this.name = name;
		this.age = age;
		this.brithday = brithday;
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

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", brithday=" + brithday + ", dog=" + dog + "]";
	}

}
