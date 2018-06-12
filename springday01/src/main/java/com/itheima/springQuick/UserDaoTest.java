package com.itheima.springQuick;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	@Test
	public void testUserDao() {
		// 创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取UserDaoImpl对象
		UserDaoImpl uBean = (UserDaoImpl) ac.getBean("userDaoIm");
		//调用其中的方法和属性
		uBean.hello();
		System.out.println(uBean.getUsername());
	}
}
