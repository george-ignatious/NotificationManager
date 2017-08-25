package com.dw.submit;

import com.dw.engine.INotificationsEngine;
import com.dw.engine.Selector;
import com.dw.notification.Notification;

public class Notifier {
public static void notify(Notification notification,String notificationHandler){
	INotificationsEngine notificationEngine = Selector.getNotificationsEngine();
	notificationEngine.handle(notification, notificationHandler);
}
}
