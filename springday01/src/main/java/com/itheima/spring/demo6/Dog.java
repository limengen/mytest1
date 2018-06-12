package com.itheima.spring.demo6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("mydog")
public class Dog {
	@Value("点点")
	private String name;
	@Value("白色")
	private String color;
	@Value("18")
	private int age;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

}
