package com.ldj.suanfa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int e = arr.length - 1;
		quicksort(arr, 0, e);
		for(int i : arr) {
			System.out.print(i + "  ");
		}
	}
	
	private static void quicksort(int[]a, int s, int e) {
		if(s < e) {
			int q = sort(a, s, e);
			quicksort(a, s, q - 1);
			//a[q]已经定下来
			quicksort(a, q + 1 , e);
		}
	}
	
	private static int sort(int[]a, int m ,int n) {
		int i = m + 1;//从去标准值的后一个开始排
		int j = n;
		int x = a[m];
		while(true) {
			while(i < n + 1 && a[i] < x) {
				i++;
			}
			while(a[j] > x) {
				j--;
			}
			if(i >= j) break;
			
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
		}
		a[m] = a[j];
		a[j] = x;
		return j;
	}
}
