package com.ldj.BasicUser;

public class BasicDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 char byte ֮�䲻���Զ�ת��
 char short ֮�䲻���Զ�ת��
*/
		char c = 'a';
		byte i = 9;
		System.out.println(getType(i + c));//int����
	}
	
	public static String getType(Object o) {
		return o.getClass().toString();
	}

}
