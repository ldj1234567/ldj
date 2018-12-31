package com.ldj.BasicUser;

public class BasicDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 char byte 之间不会自动转换
 char short 之间不会自动转换
*/
		char c = 'a';
		byte i = 9;
		System.out.println(getType(i + c));//int类型
	}
	
	public static String getType(Object o) {
		return o.getClass().toString();
	}

}
