package com.exception;

import java.io.*;

class Parent1 {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild1 extends Parent1 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent1 p = new TestExceptionChild1();
		p.msg();
	}
}