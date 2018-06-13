package com.itheima.spring.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PersonServiceProxy {
	// 前置通知
	public void saveProxy(JoinPoint jp) {
		System.out.println(jp.getSignature().getDeclaringType());
		System.out.println(jp.getSignature().getDeclaringTypeName());
		
		System.out.println("save执行之前增强");
	}

	// 后置通知
	public void deleteProxy(Object obj) {
		System.out.println(obj);
		System.out.println("delete执行之后增强");
	}

	// 环绕通知
	public void updateProxy(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("update环绕执行之前增强");
		Object obj=joinPoint.proceed();
		System.out.println("update环绕执行之后增强");
		System.out.println(obj);
	}

	// 异常通知
	public void queryProxy(Throwable th) {
		System.out.println(th);
		System.out.println("query执行异常后增强");
	}
	//最后通知
	public void batchProxy(JoinPoint jp) {
		System.out.println(jp.getSignature().getDeclaringType());
		System.out.println(jp.getSignature().getDeclaringTypeName());
		System.out.println("batch执行最后增强");
	}
	
}
