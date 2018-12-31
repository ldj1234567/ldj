package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class DaemonThreadUser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() ->
		{
			while(true) {
				try {
					System.out.println("t1 is running!");
					TimeUnit.SECONDS.sleep(5);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		
		t1.setDaemon(true);//设置其为守护线程,当只有守护线程运行时，JVM自动退出进程
		
		t1.start();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Main Thread is finished");
	}

}
