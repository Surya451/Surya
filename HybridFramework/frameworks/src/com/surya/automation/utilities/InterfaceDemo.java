package com.surya.automation.utilities;

interface One{
	void demo();
   default void display() {
		System.out.println("default method");
	}
	
}
class Oneimpl implements One{
	
	@Override
	public void demo() {
		System.out.println("a");
	}
	/*
	 * @Override public void display() {
	 * System.out.println("overrided default method"); }
	 */
}

public class InterfaceDemo {
public static void main(String[] args) {
	Oneimpl i =new Oneimpl();
	i.demo();
	i.display();
	
}
}
