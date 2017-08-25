package com.dw.context;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextManager {
	private static ApplicationContext handlersSpringContext = new ClassPathXmlApplicationContext("handlers.xml");
	private static ApplicationContext notificationManagerSpringContext = new ClassPathXmlApplicationContext("notificationmanager.xml");

	
	private static ConfigurableListableBeanFactory getBeanFactory(ApplicationContext context){
		ConfigurableListableBeanFactory beanFactory = ((ConfigurableApplicationContext) context).getBeanFactory();
		return beanFactory;
	}
	
	public static void addBean(ApplicationContext context,String name,Object bean ){
		getBeanFactory(context).registerSingleton(name, bean);;
	}
	
	public static ApplicationContext getHandlersSpringContext() {
		return handlersSpringContext;
	}

	public static void setHandlersSpringContext(ApplicationContext springContext) {
		ContextManager.handlersSpringContext = springContext;
	}

	public static ApplicationContext getNotificationManagerSpringContext() {
		return notificationManagerSpringContext;
	}

	public static void setNotificationManagerSpringContext(ApplicationContext notificationManagerSpringContext) {
		ContextManager.notificationManagerSpringContext = notificationManagerSpringContext;
	}
}
