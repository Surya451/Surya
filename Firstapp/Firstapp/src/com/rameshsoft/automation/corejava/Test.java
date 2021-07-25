package com.rameshsoft.automation.corejava;
//Data hiding
public class Test {
int a=33,b=43;
 final private void display() {
	 int a=222;
 System.out.println("The value of a: "+a);
 System.out.println("The value of b: "+b);
}
public void add() {
 int c=a+b;
 System.out.println("the value of c= "+c);
}
public static void main(String[] args) {
	Test test=new Test();
	test.display();
	test.add();
}
}
