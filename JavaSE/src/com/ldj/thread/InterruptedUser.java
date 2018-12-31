package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class InterruptedUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread tt = new Thread() {
			public void run() {
				while(true) {
					System.out.println(Thread.interrupted());
				}
			}
		};
		
		tt.setDaemon(true);
		tt.start();
		
		TimeUnit.MILLISECONDS.sleep(1);
		tt.interrupt();
	}

}
