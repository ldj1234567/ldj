package com.ldj.thread;

import java.util.concurrent.TimeUnit;

public class ISInterruptUser {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Thread thread = new Thread() 
		{
			public void run()
			{
				while(true) 
				{
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println("1s pass");
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Yeah! I find the interrupt!  " + isInterrupted());
					}
				}
			}
		};
		thread.setDaemon(true);
		thread.start();
		TimeUnit.SECONDS.sleep(1);//sleep�Ჶ���ж��źţ���������һ��ֻ�ܲ���һ�Σ�  Ϊ�˲�Ӱ������������ִ��
		System.out.println("Thread is interrupt? \t" + thread.isInterrupted());
		thread.interrupt();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Thread is interrupt? \t" + thread.isInterrupted());
		thread.interrupt();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Thread is interrupt? \t" + thread.isInterrupted());
	}

}
