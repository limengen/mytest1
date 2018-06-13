package com.itheima.spring.demo02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext2.xml")
public class AOPTest {
	@Autowired
	private PersonService ps;

	@Test
	public void testPersonService() {
		ps.save();
		System.out.println("----------------------------");
		ps.delete();
		System.out.println("----------------------------");
		ps.update();
		System.out.println("----------------------------");
		//ps.query();
		System.out.println("----------------------------");
		//ps.batch();
	}
}
