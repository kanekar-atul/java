package com.thisex;

class StudentSix {
	int rollno;
	String name, course;
	float fee;

	StudentSix(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	StudentSix(int rollno, String name, String course, float fee) {
		this.fee = fee;
		//this(rollno, name, course);// C.T.Error
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis8 {
	public static void main(String args[]) {
		StudentSix s1 = new StudentSix(111, "ankit", "java");
		StudentSix s2 = new StudentSix(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}