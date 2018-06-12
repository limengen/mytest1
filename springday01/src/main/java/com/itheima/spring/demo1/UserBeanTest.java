package com.itheima.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanTest {
	// 创建对象方式一 构造方法
	@Test
	public void testUserBean1() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBean1 bean = (UserBean1) ac.getBean("userBean1");
		// UserBean1 bean2 = (UserBean1) ac.getBean("userBean1");
		bean.hello();

		// <!--作用域 scope="prototype" 多例，每次取出的值不一样 -->
		// <!--作用域 scope="singleton" 单例，每次取出的值一样 默认值-->
		// bean2.hello();
		// if (bean == bean2) {
		// System.out.println("一样");
		// } else {
		// System.out.println("不一样");
		// }
		// 关闭容器，执行destroy-method配置的销毁方法
		ac.close();
	}

	// 创建对象方式二 静态工厂
	@Test
	public void testUserBean2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBean2 bean = (UserBean2) ac.getBean("userBean2");
		bean.hello();
	}

	// 创建对象方式三 实例工厂
	@Test
	public void testUserBean3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBean3 bean = (UserBean3) ac.getBean("userBean3");
		bean.hello();
	}
}
