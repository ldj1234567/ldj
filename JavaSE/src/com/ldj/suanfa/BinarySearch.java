package com.ldj.suanfa;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10,15};
		System.out.println(search(arr, 15, 0, 10));
	}
	
	private static int search(int[] a, int index, int s, int e) {
		while(s <= e) {
			int mid = (s + e) / 2;
			if(index == a[mid]) {
				return mid;
			}
			if(index > a[mid]) {
				s = mid + 1;
				return search(a, index, s, e);
			}else {
				e = mid - 1;
				return search(a, index, s, e);
			}
		}
		return -1;
	}
}
