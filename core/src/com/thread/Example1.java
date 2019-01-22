package com.thread;

class MyClass extends Thread {

	private Thread t;
	private String threadName;

	MyClass(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {

			//Thread.sleep(50);
			this.withdrow();

		} catch (Exception e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void withdrow() {

		synchronized (this) {
			System.out.println("Inside first block..");
			System.out.println("Running " + threadName);
			//synchronized (this) {
				System.out.println("Inside second block..");
				System.out.println("Running " + threadName);
			//}
			System.out.println("outside the inner block " + threadName);
		}
	}

}

public class Example1 {

	public static void main(String[] args) {
		MyClass T1 = new MyClass("Thread-1");
		T1.start();

		MyClass T2 = new MyClass("Thread-2");
		T2.start();
	}

}
