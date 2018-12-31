package com.ldj.suanfa;

public class Sort_quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,10,6,5,4,3,2,1};
		int end = arr.length - 1;
		System.out.println("-----------------start------------------");
		basic_quickSort(arr, 0, end);
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	//基本方法
	private static void basic_quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int index = partition(arr, start, end);
			basic_quickSort(arr, start, index - 1);
			//ARR[index]已经定下来
			basic_quickSort(arr, index + 1, end);
		}
	}
	private static int  partition(int[] arr, int m, int n) {
		int i = m + 1;//从去标准值的后一个开始排
		int j = n;
		int index = arr[m];
		while(true) {
			while( i < n + 1 && arr[i] < index ) {
				i++;
			}
			while(arr[j] > index) {
				j--;
			}
			if(i >= j) break;
			arr = swap(arr,i,j);
		}
		arr[m] = arr[j];
		arr[j] = index;
		for(int k : arr) {
			System.out.print(k + "  ");
		}
		System.out.println();
		return j;
	}
	
	private static int[] swap(int[] arr, int i , int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}
}
