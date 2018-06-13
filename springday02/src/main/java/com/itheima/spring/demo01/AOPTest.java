package com.itheima.spring.demo01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	@Test
	public void testPersonService() {
		ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService ps = (PersonService) cpa.getBean("personService");
		//ps.save();
		//ps.delete();
		 //ps.update();
		// ps.query();
		ps.batch();
	}
}
