package com.training.cg.dp;

public class FactoryDesign {
	public static void main(String [] args) {
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("email");
		notification.notifyUser();
	}
}
//	Superclass or Interface can point to subclass objects

//	Factory Design Pattern : It is creational design pattern:
//	It says that create an Interface and let the subclass decide
//	which object to create

//	Singleton Design Pattern : When only one instance of a class
//	is needed, we go for Singleton Design Pattern.
//	This is also creational design pattern.

//	Structural Design Pattern

//	1. Decorator Design Pattern : It allows to add functionality dynamically
//	without affecting objects of the same class.

//	2. Facade Design Pattern : Hides the complexity of the application and provides a simplier
//	interface to the client.
