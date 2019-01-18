package com.objectclass;

class StudentTwo {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

public class ObjectInitializationThroughMethod {

	public static void main(String args[]) {
		StudentTwo s1 = new StudentTwo();
		StudentTwo s2 = new StudentTwo();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}
