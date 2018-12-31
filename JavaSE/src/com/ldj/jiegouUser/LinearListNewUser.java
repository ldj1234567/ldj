package com.ldj.jiegouUser;

public abstract class LinearListNewUser <E> implements ListNewUser<E> {
	
	
	
	
	public LinearListNewUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	abstract E getData(int x);
	//取第x + 1 个元素
	abstract boolean setData(int x, E e);
	//将下标为x的元素值设为e
	abstract int Locate(E e);
	//返回e的下标
	abstract boolean Remove(E e);
	//删除第一个元素e
	abstract boolean Remove(int x);
	//删除下标为x的元素
	abstract boolean Insert(int x, E e);
	//在下标为x的地方插入新元素e，其后元素顺延
	
}
