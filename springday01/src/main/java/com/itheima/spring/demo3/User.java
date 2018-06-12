package com.itheima.spring.demo3;

import java.util.Date;

public class User {
	private String username;
	private String sex;
	private int age;
	private Date birthday;

	private Dog dog;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public User() {
		super();
	}

	public User(String username, String sex, int age, Date birthday) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", age=" + age + ", birthday=" + birthday + ", dog="
				+ dog + "]";
	}

}
