package com.dw.engine;

import com.dw.handlers.HandlerManager;
import com.dw.notification.Notification;

public class NotificationsEngine implements INotificationsEngine{

	@Override
	public void handle(Notification notification,String handler) {
		HandlerManager.getHandler(handler).handle(notification);
	}

}
