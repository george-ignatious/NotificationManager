package com.dw.engine;

import com.dw.context.ContextManager;
import com.dw.user.IUserManager;

public class Selector {
	private static INotificationsEngine notificationsEngine;
	private static IUserManager usersManager;

	public static void setNotificationsEngine(INotificationsEngine notificationEngine) {
		notificationsEngine = notificationEngine;
	}

	public static INotificationsEngine getNotificationsEngine() {
		if (notificationsEngine == null) {
			return ContextManager.getNotificationManagerSpringContext().getBean("NotificationsEngine",
					NotificationsEngine.class);
		} else {
			return notificationsEngine;
		}
	}
	
	public static void setUserManager(IUserManager userManager) {
		usersManager = userManager;
	}

	public static IUserManager getUserManager() {
		if (usersManager == null) {
			return ContextManager.getNotificationManagerSpringContext().getBean("UserManager",
					IUserManager.class);
		} else {
			return usersManager;
		}
	}
}
