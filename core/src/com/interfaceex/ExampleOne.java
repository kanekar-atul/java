package com.interfaceex;

interface printable {
	void print();
}

class ExampleOne implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		ExampleOne obj = new ExampleOne();
		obj.print();
	}
}
