package com.inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
	void bark() {
		System.out.println("barking.P..");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}