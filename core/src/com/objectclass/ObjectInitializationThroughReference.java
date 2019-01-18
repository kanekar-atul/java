package com.objectclass;

class StudentOne {
	int id;
	String name;
}

public class ObjectInitializationThroughReference {
	public static void main(String args[]) {
		StudentOne s1 = new StudentOne();
		s1.id = 101;
		s1.name = "Sonoo";
		System.out.println(s1.id + " " + s1.name);// printing members with a white space
	}
}
