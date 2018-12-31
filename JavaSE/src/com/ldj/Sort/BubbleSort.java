package com.ldj.Sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		bubbleSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static void bubbleSort(int[] arr) {
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
