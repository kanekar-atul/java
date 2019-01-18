package com.overload.constructors;

public class InitializeValuesFrmObjToObj {
	int id;
	String name;

	// constructor to initialize integer and string
	InitializeValuesFrmObjToObj(int i, String n) {
		id = i;
		name = n;
	}

	// constructor to initialize another object
	InitializeValuesFrmObjToObj(InitializeValuesFrmObjToObj s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		InitializeValuesFrmObjToObj s1 = new InitializeValuesFrmObjToObj(111, "Karan");
		InitializeValuesFrmObjToObj s2 = new InitializeValuesFrmObjToObj(s1);
		s1.display();
		s2.display();
	}
}
