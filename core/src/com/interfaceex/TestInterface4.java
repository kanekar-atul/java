package com.interfaceex;

interface Printable3 {
	void print();
}

interface Showable3 extends Printable3 {
	void show();
}

class TestInterface4 implements Showable3 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}
}