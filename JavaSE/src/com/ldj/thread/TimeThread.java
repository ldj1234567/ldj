package com.ldj.thread;

public class TimeThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fir f = new fir();
		sec s = new sec();
		Thread t1 = new Thread(f, "fir");
		Thread t2 = new Thread(s, "sec");
		t1.start();
		t2.start();
	}

}
class fir implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		del_fir();
		long endTime = System.nanoTime();
		System.out.println("√∞≈›≈≈–Ú: " + (endTime - startTime));
	}
	private void del_fir() {
		int size = 10000;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = size - i;
		}
		for (int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr.length - j - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					arr[i + 1] = arr[i] + arr[i + 1];
					arr[i] = arr[i + 1] - arr[i];
					arr[i + 1] = arr[i + 1] - arr[i];
				}
			}
		}
	}
	
}
class sec implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		del_sec();
		long endTime = System.nanoTime();
		System.out.println("≤Â»Î≈≈–Ú: " + (endTime - startTime));
	}
	private void del_sec() {
		int size = 10000;
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = size - i;
		}
		for (int i = 1; i < arr.length; i++) {
			int index = arr[i];
			int j = i - 1;
			while(j >= 0 && index < arr[j] ) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = index;
		}
	}
}