package com.thisex;

public class TestThis9 {
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static void main(String args[]) {
		TestThis9 obj = new TestThis9();
		System.out.println(obj);// prints the reference ID
		obj.m();
	}
}
