package com.itheima.springQuick;

public class UserDaoImpl implements UserDao {
	private String username;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public void hello() {
		System.out.println("Hello Spring");
	}

}
