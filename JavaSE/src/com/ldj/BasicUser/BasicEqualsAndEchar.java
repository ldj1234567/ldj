package com.ldj.BasicUser;

public class BasicEqualsAndEchar {
/*
 ==�űȽϵ��ǵ�ַ������ֵ�Ƚ�
 equals()�Ƚϵ�������
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "abc";
		//a��bָ����ͬһ���ַ
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
