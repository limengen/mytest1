package com.itheima.spring.demo6;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//注解@Component就是告诉Spring容器要进行实例化
//value相当于在xml配置文件当中所配置的id属性
//可以省略value的配置，如果省略，那么默认是类名，首字母小写
@Component(value = "person")
public class Person {
	@Value("张三")
	private String name;
	@Value("18")
	private int age;
	@Value("北京黑马")
	private String address;
	// @Autowired不是通过名字注入，通过类型注入
	// 会在容器中去找符合这个参数类型的实例，或者参数类型子类的实例
	// @Autowired
	// private Dog dog;

	// @Autowired @Qualifier("mydog") byname查找
	@Autowired
	@Qualifier("mydog")
	private Dog dog;

	// @Resource(name = "mydog")
	// private Dog dog;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address, Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dog = dog;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", dog=" + dog + "]";
	}

}
