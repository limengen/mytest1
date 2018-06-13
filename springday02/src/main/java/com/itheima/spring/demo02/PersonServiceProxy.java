package com.itheima.spring.demo02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonServiceProxy {
	// 前置通知
	@Before("execution(* save*(..))")
	public void saveProxy(JoinPoint jp) {
		System.out.println(jp.getSignature().getDeclaringType());
		System.out.println(jp.getSignature().getDeclaringTypeName());

		System.out.println("save执行之前增强");
	}

	// 后置通知
	@AfterReturning(value = "execution(* delete*(..))", returning = "obj")
	public void deleteProxy(JoinPoint joinPoint, Object obj) {
		System.out.println(obj);
		System.out.println("delete执行之后增强");
	}

	// 环绕通知
	@Around("execution(* update*(..))")
	public void updateProxy(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("update环绕执行之前增强");
		Object obj = joinPoint.proceed();
		System.out.println("update环绕执行之后增强");
		System.out.println(obj);
	}

	// 异常通知
	@AfterThrowing(value = "execution(* query*(..))", throwing = "th")
	public void queryProxy(Throwable th) {
		System.out.println(th);
		System.out.println("query执行异常后增强");
	}

	// 最后通知
	@After("execution(* batch*(..))")
	public void batchProxy(JoinPoint jp) {
		System.out.println(jp.getSignature().getDeclaringType());
		System.out.println(jp.getSignature().getDeclaringTypeName());
		System.out.println("batch执行最后增强,我是最终通知，就算程序有异常，也会执行");
	}

}
