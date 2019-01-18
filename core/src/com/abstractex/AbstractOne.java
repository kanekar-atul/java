package com.abstractex;

abstract class Bike{
	abstract void run();
	
	public void getData() {
		System.out.println("THis is from getData()");
	}
}

public class AbstractOne extends Bike {

	public void run() {
		System.out.println("run() implemented..");
	}
	
	public static void main(String[] args) {
		AbstractOne a = new AbstractOne();
		a.run();
		a.getData();
	}
}
