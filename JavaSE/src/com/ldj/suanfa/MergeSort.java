package com.ldj.suanfa;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {9,7,5,6,4,3,2,1,8,7};
		int e = arr.length - 1;
		mergeSort(arr, 0, e);
		for(int i : arr) {
			System.out.print(i + "  ");
		}
	}
	
	private static void mergeSort(int[]a, int s, int e) {
		if(s < e) {//确保至少有两个元素
			int i = (s + e) / 2;//取中点划分
			mergeSort(a, s, i);
			mergeSort(a, i + 1, e);
			sort(a, s , i ,e);
		}
	}
	
	private static void sort(int[]a, int left, int mid, int right) {
		int[] b = new int[a.length];
		int i = left;
		int j = mid + 1;
		int k = left;
		while(i <= mid && j <= right) {
			if(a[i] <= a[j]) {
				b[k] = a[i];
				i++;
			}else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		if(i > mid) {
			for(int p = j; p <= right; p++) {
				b[k] = a[p];
				k++;
			}
		}else {
			for(int p = i; p <= mid; p++) {
				b[k] = a[p];
				k++;
			}
		}
		
		for(int q = left; q < right + 1; q++) {
			a[q] = b[q];
		}
	}
}
