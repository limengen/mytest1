package com.itheima.spring.demo01;

public class PersonServiceImpl implements PersonService {

	@Override
	public void save() {
		System.out.println("执行save方法");
	}

	@Override
	public void delete() {
		System.out.println("执行delete方法");

	}

	@Override
	public void update() {
		System.out.println("执行update方法");
	}

	@Override
	public int query() {
		System.out.println("执行query方法");
		int a=1/0;
		return 1000;
	}

	@Override
	public int batch() {
		System.out.println("执行batch方法");
		return 2000;
	}

}
