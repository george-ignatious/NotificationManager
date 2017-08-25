package com.dw.integrationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dw.handlers.DefaultNotificationHandlers;
import com.dw.notification.Notification;
import com.dw.submit.Notifier;
import com.dw.user.DefaultUser;

public class FullFlowTest {

	@Test
	public void fullFlowTest() {
		Notifier.notify(new Notification("Full Flow Test", "This is success", new DefaultUser("georgeignatious93")), DefaultNotificationHandlers.EMAILHANDLER);
	}

}
