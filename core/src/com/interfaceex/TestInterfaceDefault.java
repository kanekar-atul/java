package com.interfaceex;

interface Drawable5 {
	void draw();

	default void msg() {
		System.out.println("default method- from Drawable5");
	}
}

interface Drawable4 {
	void draw();

	default void msg() {
		System.out.println("default method - from Drawable4");
	}
}

class Rectangle4 implements Drawable4,Drawable5 {
	 
	public void draw() {
		System.out.println("drawing rectangle");
	}

	@Override
	public void msg() { 
		Drawable5.super.msg();
	}
	
	 
	
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable4 d = new Rectangle4();
		d.draw();
		d.msg();
	}
}