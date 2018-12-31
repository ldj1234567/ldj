package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class InterruptUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(()->
		{
			try {
				int index = 60;
				while(index >= 0) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println(index);
					index--;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("I'm be interrupted");
			}
		});
		
		thread.start();
		
		TimeUnit.SECONDS.sleep(5);//阻塞Main线程5s
		thread.interrupt();//打断阻塞线程，会报InterruptedException,后续进程不会执行
//		System.out.println("Main thread is end");
	}

}
