package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				d1();
			}
		}.start();
		d2();
	}
	
	private static void d1() {
		while(true) {
			System.out.println("d1");
			sleep(1);
		}
		
	}
	private static void d2() {
		while(true) {
			System.out.println("d2");
			sleep(1);
		}
		
	}
	private static void sleep(int sec) {
		try {
			TimeUnit.SECONDS.sleep(sec);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
