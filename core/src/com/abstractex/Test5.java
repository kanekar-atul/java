package com.abstractex;
interface C2{
	void E();
}

interface A2 extends C2 {
	void a();

	void b();

	void c();

	void d();
}

abstract class B2 implements A2 {
	
	
}

class M2 extends B2 {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
	public void E() {
		System.out.println("I am d");
	}
	public void c() {
		System.out.println("I am c");
	}
	
}

class Test5 {
	public static void main(String args[]) {
		A2 a = new M2();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}