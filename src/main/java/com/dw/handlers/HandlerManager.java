package com.dw.handlers;

import com.dw.context.ContextManager;

public class HandlerManager {

	public static INotificationHandler getHandler(String handler) {
		return ContextManager.getHandlersSpringContext().getBean(handler.toString(),INotificationHandler.class);
	}
}
