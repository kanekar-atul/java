package com.inheritance;

public class ClassA {

	ClassA(){
		System.out.println("This is from ClassA constructor");
	}
	
	{
		System.out.println("This is from block - ClassA");
	}
	
	public void getVal() {
		System.out.println("THis is from getVal() - ClassA");
	}
	
	public void getA() {
		System.out.println("THis is from getValA() - ClassA");
	}
	
	
}
