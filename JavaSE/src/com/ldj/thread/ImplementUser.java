package com.ldj.thread;

public class ImplementUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
本质上讲，final能够做出如下保证：当你创建一个对象时，使用final关键字能够使得另一个线程不会访问到处于“部分创建”的对象，
否则是会可能发生的。这是 因为，当用作对象的一个属性时，final有着如下的语义：
 当构造函数结束时，final类型的值是被保证其他线程访问该对象时，它们的值是可见的
		 * */
		final Ifather i1 = new Ifather();
		Thread t1 = new Thread(i1, "一号");
		Thread t2 = new Thread(i1, "二号");
		Thread t3 = new Thread(i1, "三号");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class Ifather implements Runnable{
	private int index = 1;
	private static final int MAX = 50;
	
	public Ifather() {
		super();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(index < MAX) {
			/*
			System.out.println("柜员机出号:" + index);
			index++;
			不安全，涉及线程 数据要一步运算，不要多步调用
			*/
			System.out.println("柜员机出号:" + (index++));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}