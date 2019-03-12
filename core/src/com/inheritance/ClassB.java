package com.inheritance;

public class ClassB extends ClassA {

	static {
		System.out.println("Static Block ClassB");
	}
	
	ClassB() {
		System.out.println("This is from ClassB constructor");
	}

	{
		System.out.println("This is from block - ClassB");
	}

	public void getVal() {
		System.out.println("THis is from getVal() - ClassB");
	}

	public void getB() {
		System.out.println("THis is from getValA() - ClassB");
	}

	public static void main(String[] args) {

		ClassB b = new ClassB();
		/*b.getA();
		b.getB();
		b.getVal();

		ClassA a = new ClassB();
		a.getVal();*/

	}

}
