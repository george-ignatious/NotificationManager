package com.dw.user;

public class DefaultUser implements IUser {
	private String name;

	public DefaultUser(String name) {
		this.name = name;
	}

	@Override
	public String getUserId() {
		// TODO Auto-generated method stub
		return name;
	}

}
