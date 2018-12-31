package com.ldj.thread;

public class ThreadCreateMethod_sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImplenent thrI1 = new ThreadImplenent();
		Thread t1 = new Thread(thrI1, "tt");
		t1.start();
	}

}

class ThreadImplenent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm running");
	}
	
}