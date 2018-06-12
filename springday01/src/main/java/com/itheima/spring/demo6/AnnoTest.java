package com.itheima.spring.demo6;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {
	/*
	 * 注解测试
	 */

	@Test
	public void testZhuJiePerson() {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Person bean = (Person) cpx.getBean("person");
		System.out.println(bean);
		
	}
}
