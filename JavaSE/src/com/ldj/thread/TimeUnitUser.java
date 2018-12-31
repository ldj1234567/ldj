package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class TimeUnitUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("TimeUnit.SECONDS.sleep(5): Stop for five seconds");
		TimeDown t1 = new TimeDown(5);
		Thread t11 = new Thread(t1, "5s");
		t11.start();
//Main函数运行到线程建立时，线程才创立并自我运行		
//		TimeUnit.SECONDS.sleep(10); 此时为Main阻塞
		
		System.out.println("TimeUnit.MINTUES.sleep(1): Stop for one minute");
		TimeDown t2 = new TimeDown(60);
		Thread t21 = new Thread(t2, "5s");		
		t21.start();
//		TimeUnit.SECONDS.sleep(10); 此时为Main阻塞
		System.out.println("end!");
	}

}
class TimeDown implements Runnable{
	private int seconds;
	public TimeDown(int seconds) {
		this.seconds = seconds;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(this.seconds >= 0) {
			try {
				System.out.println(this.seconds);
				TimeUnit.SECONDS.sleep(1);
				this.seconds--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
