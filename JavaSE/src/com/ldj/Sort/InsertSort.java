package com.ldj.Sort;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		insertSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static void insertSort(int[] arr) {
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
