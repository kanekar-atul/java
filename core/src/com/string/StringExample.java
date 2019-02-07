package com.string;

public class StringExample {
	public static void main(String args[]) {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		String s11 = "JAVA";
        String s22 = "JAVA";
        System.out.println(s11 == s22);         //Output : true
        s11 = s11 + "J2EE";
        System.out.println(s11 == s22);         //Output : false
	}
}