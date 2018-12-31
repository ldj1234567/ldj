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
		
		TimeUnit.SECONDS.sleep(5);//����Main�߳�5s
		thread.interrupt();//��������̣߳��ᱨInterruptedException,�������̲���ִ��
//		System.out.println("Main thread is end");
	}

}
