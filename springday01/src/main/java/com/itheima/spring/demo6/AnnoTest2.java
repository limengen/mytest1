package com.itheima.spring.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext3.xml")

public class AnnoTest2 {
	/*
	 * Spring域juint整合
	 */

	@Autowired
	private Person person;
	@Autowired
	private Dog dog;

	@Test
	public void testJuint() {
		System.out.println(person);
		System.out.println(dog);
	}
}
