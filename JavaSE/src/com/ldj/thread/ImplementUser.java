package com.ldj.thread;

public class ImplementUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
�����Ͻ���final�ܹ��������±�֤�����㴴��һ������ʱ��ʹ��final�ؼ����ܹ�ʹ����һ���̲߳�����ʵ����ڡ����ִ������Ķ���
�����ǻ���ܷ����ġ����� ��Ϊ�������������һ������ʱ��final�������µ����壺
 �����캯������ʱ��final���͵�ֵ�Ǳ���֤�����̷߳��ʸö���ʱ�����ǵ�ֵ�ǿɼ���
		 * */
		final Ifather i1 = new Ifather();
		Thread t1 = new Thread(i1, "һ��");
		Thread t2 = new Thread(i1, "����");
		Thread t3 = new Thread(i1, "����");
		
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
			System.out.println("��Ա������:" + index);
			index++;
			����ȫ���漰�߳� ����Ҫһ�����㣬��Ҫ�ಽ����
			*/
			System.out.println("��Ա������:" + (index++));
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}