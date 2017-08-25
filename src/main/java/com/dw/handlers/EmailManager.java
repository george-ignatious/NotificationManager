package com.dw.handlers;

import javax.mail.Session;

public class EmailManager {

	public static Session getEmailSession() {
		GoogleEmailSession googleEmailSession = new GoogleEmailSession();
		return googleEmailSession.getEmailSession();
	}
}
