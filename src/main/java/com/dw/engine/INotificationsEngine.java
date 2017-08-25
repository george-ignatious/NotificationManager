package com.dw.engine;

import com.dw.notification.Notification;

public interface INotificationsEngine {
public void handle(Notification notification, String handler);
}
