package com.thisex;

class StudentFive {
	int rollno;
	String name, course;
	float fee;

	StudentFive(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	StudentFive(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis7 {
	public static void main(String args[]) {
		StudentFive s1 = new StudentFive(111, "ankit", "java");
		StudentFive s2 = new StudentFive(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}