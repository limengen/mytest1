package com.itheima.spring.demo5;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;

import com.itheima.spring.demo4.ConnectProperty;

public class SpringWebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * spring和javaWeb整合
		 */
		// 获取servletContext对象
		ServletContext servletContext = request.getServletContext();
		// 获取容器
		WebApplicationContext wac = (WebApplicationContext) servletContext
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//获取bean
		ConnectProperty bean = (ConnectProperty) wac.getBean("connectProperty");
		List list = bean.getList();
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}