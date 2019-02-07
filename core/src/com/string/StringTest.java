package com.string;


public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);
		
		String s11 = "abc";
		StringBuffer s22 = new StringBuffer(s11);
		System.out.println(s1.equals(s22));
		
		
		
		String s21 = "abc";
		StringBuffer s12 = new StringBuffer(s21);
		System.out.println(s21.equals(s12));
		
	}

}