package com.ldj.thread;

public class ExtendsUser {
	public static void main(String[] args) {
		Efather e1 = new Efather("һ��");
		e1.start();
		Efather e2 = new Efather("����");
		e2.start();
		Efather e3 = new Efather("����");
		e3.start();
	}
	
	
}
//�����̰߳�ȫ���⣬������Դй¶
class Efather extends Thread{
	private final String name;
	private static int number = 1;
	private static final int MAX = 50;
	
	Efather(String name){
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(number < MAX) {
			System.out.println(this.name + "��Ա������:" + (number++));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	
}
