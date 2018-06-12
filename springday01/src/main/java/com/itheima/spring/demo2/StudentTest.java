package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	// <!-- 使用构造方法赋值 -->
	@Test
	public void testStudentConst() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) cp.getBean("studentConst");
		System.out.println(s);
	}

	// <!-- 使用构造方法赋值2 -->
	@Test
	public void testStudentConst2() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) cp.getBean("studentConst2");
		System.out.println(s);
	}

	// <!-- 使用构造方法赋值3 -->
	@Test
	public void testStudentAndDogConst() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) cp.getBean("studentAndDogConst");
		System.out.println(s);
	}
}
