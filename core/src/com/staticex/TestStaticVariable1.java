package com.staticex;

class StudentThree {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	// constructor

	StudentThree(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticVariable1 {
	public static void main(String args[]) {
		StudentThree s1 = new StudentThree(111, "Karan");
		StudentThree s2 = new StudentThree(222, "Aryan");
		// we can change the college of all objects by the single line of code
		// StudentThree.college="BBDIT";
		s1.display();
		s2.display();
	}
}
