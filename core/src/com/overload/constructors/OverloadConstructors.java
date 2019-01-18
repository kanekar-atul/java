package com.overload.constructors;

public class OverloadConstructors {

	int id;
	String name;
	int age;

	// creating two arg constructor
	OverloadConstructors(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	OverloadConstructors(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		OverloadConstructors s1 = new OverloadConstructors(111, "Karan");
		OverloadConstructors s2 = new OverloadConstructors(222, "Aryan", 25);
		s1.display();
		s2.display();
	}

}
