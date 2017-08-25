package com.dw.handlers;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.dw.engine.Selector;
import com.dw.notification.Notification;

public class EmailHandler implements INotificationHandler {

	
	@Override
	public void handle(Notification notification) {
		sendEmail(Selector.getUserManager().getEmail(notification.getUser().getUserId()), notification.getTitle(),
				notification.getContent());
	}

	public void sendEmail(String to, String title, String content) {
		// Recipient's email ID needs to be mentioned.

		// Sender's email ID needs to be mentioned
		String from = "jojualiasgeorge@gmail.com";



		Session session = EmailManager.getEmailSession();

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field
			message.setSubject(title);

			// Now set the actual message
			message.setText(content);

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}
