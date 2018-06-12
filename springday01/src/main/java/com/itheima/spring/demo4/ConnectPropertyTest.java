package com.itheima.spring.demo4;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectPropertyTest {
	@Test
	public void testConnectProperty() {
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConnectProperty cp = (ConnectProperty) cpac.getBean("connectProperty");
		List list = cp.getList();
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("===============================");
		Map<Object, Object> map = cp.getMap();
		Set<Entry<Object, Object>> set = map.entrySet();
		for (Entry<Object, Object> entry : set) {
			System.out.println(entry.getKey() + "-----" + entry.getValue());
		}
		System.out.println("===============================");
		Set set2 = cp.getSet();
		for (Object o : set2) {
			System.out.println(o);
		}

		System.out.println("===============================");
		Properties props = cp.getProps();
		System.out.println(props);

	}
}
