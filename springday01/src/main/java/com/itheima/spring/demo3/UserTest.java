package com.itheima.spring.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	@Test
	public void testUserP() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext2.xml");
		User u = (User) cp.getBean("userP");
		Dog dog = u.getDog();
		System.out.println(dog);
		System.out.println(u);
	}
}
