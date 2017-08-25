package com.dw.initialize;

import java.util.Map;

import com.dw.context.ContextManager;
import com.dw.engine.INotificationsEngine;
import com.dw.engine.Selector;
import com.dw.handlers.INotificationHandler;

public class Initialise {

	private static void addNotificationsHandler(String name,INotificationHandler notificationHandler) {
		ContextManager.addBean(ContextManager.getHandlersSpringContext(),name,notificationHandler);
	}
	
	public static void addNotificationHandlers(Map<String, INotificationHandler> notificationHandlers) {
		notificationHandlers.forEach((name, notificationHandler) -> {
			addNotificationsHandler(name, notificationHandler);
		});
	}
	
	public static void setNotificationsEngine(INotificationsEngine notificationsEngine) {
		Selector.setNotificationsEngine(notificationsEngine);
	}
}
