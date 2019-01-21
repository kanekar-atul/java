package com.exception;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}




/*
Common Scenarios of Java Exceptions
There are given some scenarios where unchecked exceptions may occur. They are as follows:

1) A scenario where ArithmeticException occurs
If we divide any number by zero, there occurs an ArithmeticException.

int a=50/0;//ArithmeticException  
2) A scenario where NullPointerException occurs
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

String s=null;  
System.out.println(s.length());//NullPointerException  
3) A scenario where NumberFormatException occurs
The wrong formatting of any value may occur NumberFormatException. Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
4) A scenario where ArrayIndexOutOfBoundsException occurs
If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException as shown below:

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  

*/