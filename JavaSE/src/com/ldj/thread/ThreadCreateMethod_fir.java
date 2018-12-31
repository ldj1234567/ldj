package com.ldj.thread;

public class ThreadCreateMethod_fir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				System.out.println("t1 is running");
			}
		}.start();
		
		ThreadExtend t2 = new ThreadExtend("t2");
		t2.start();
		
	}

}

class ThreadExtend extends Thread{
	private String name;
	public ThreadExtend(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println(this.name + " is running");
	}
}
