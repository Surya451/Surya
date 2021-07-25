package com.rameshsoft.automation.corejava;
//Overloading

class Addition_Method{
	int a,b;
	public void add(int a,int b) {
    int c=a+b;
    System.out.println("c= "+c);
	}
	public void add(float a,float b) {
	    float c=a+b;
	    System.out.println("c= "+c);
		}
	public void add(double a,double b) {
	    double c=a+b;
	    System.out.println("c= "+c);
		}
}

public class Demo3 {
public static void main(String[] args) {
	Addition_Method s=new Addition_Method();
	s.add(33,44);
	s.add(99.9f,23.33f);
	s.add(0.223322, 22.332543);
}
}