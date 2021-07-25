package com.rameshsoft.automation.corejava;


class Demo6{
	private int a;
	private String name;
	public void display() {
		System.out.println("c language");
	}
	public int getA(int a) {
		this.a=a;
		return a;
	}
	public String getName(String name) {
		this.name=name;
		return name;
	}
	
}

public class Demo5 {

	public static void main(String[] args) {
		Demo6 demo=new Demo6();
		
		System.out.println(demo.getA(88));
	    System.out.println(	demo.getName("Surya"));
	    demo.display();
	}

}
