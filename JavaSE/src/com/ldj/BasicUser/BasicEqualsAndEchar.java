package com.ldj.BasicUser;

public class BasicEqualsAndEchar {
/*
 ==号比较的是地址，是数值比较
 equals()比较的是内容
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "abc";
		//a和b指向了同一块地址
		String c = new String("abc");
		System.out.println(a == b);
		
		if(a == b) {
			System.out.println("a = b");
		}else {
			System.out.println("a != b");
		}
		
		if(a == c) {
			System.out.println("a = c");
		}else {
			System.out.println("a != c");
		}
		
		if(a.equals(c)) {
			System.out.println("a = c");
		}else {
			System.out.println("a != c");
		}
	}

}
