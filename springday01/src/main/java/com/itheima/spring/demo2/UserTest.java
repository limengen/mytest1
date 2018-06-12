package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	@Test
	public void testUserBaseSet() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) cp.getBean("userBaseSet");
		Dog dog = u.getDog();
		System.out.println(dog);
		System.out.println(u);
	}
}
