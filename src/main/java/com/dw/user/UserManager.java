package com.dw.user;

public class UserManager implements IUserManager {
	private static UserManager userManagement = null;

	private UserManager() {
	}

	public String getEmail(String userId) {
		return userId + "@gmail.com";
	}

	public static UserManager getInstance() {
		if (userManagement == null) {
			userManagement = new UserManager();
		}
		return userManagement;
	}

}
