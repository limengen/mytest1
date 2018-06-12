package com.itheima.spring.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	// <!-- 使用构造方法赋值 -->
	@Test
	public void testStudentC() {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s = (Student) cp.getBean("studentC");
		System.out.println(s);
	}

}
