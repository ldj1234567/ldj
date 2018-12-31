package com.ldj.jiegouUser;

public class SequentialListNewUser <E> extends LinearListNewUser <E> {
	//数组默认长度
	private static final int MAX_SIZE = 16;
	//空用例使用空的数组
	private static final Object[] EMPTY_ELEMENTDATA = {};
	//默认用例，要与EMPTY_ELEMENTDATA区分
	private static final Object[] DEFAULT_EMPTY_ELEMENTDATA = {};
	//
	private Object[] data;
	
	private int size;
	
	
//初始化一 自定义初始化容量
	public SequentialListNewUser(int initialCapacity) {
		super();
		// TODO Auto-generated constructor stub
		if(initialCapacity > 0) {
			this.data = new Object[initialCapacity];
		}else if(initialCapacity == 0) {
			this.data = EMPTY_ELEMENTDATA;
		}else {
			System.out.println("ERROR: initialCapacity is negative :" + initialCapacity);
		}
	}
//初始化二 
	public SequentialListNewUser() {
		super();
		this.data = DEFAULT_EMPTY_ELEMENTDATA;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	E getData(int x) {
		// TODO Auto-generated method stub
		if(x < 0) {
			System.out.println("Error: subscript is negative :" + x);
		}else if(x > size) {
			System.out.println("Error: subscript is null: " + x);
		}else {
			return (E) data[x];
		}
		return null;
	}

	@Override
	boolean setData(int x, E e) {
		// TODO Auto-generated method stub
		if(x < 0) {
			System.out.println("Error: subscript is negative :" + x);
		}else if(x > size) {
			System.out.println("Error: Index " + x + " out-of-bounds for length  " + size);
		}else {
			data[x] = e;
			return true;
		}
		return false;
	}

	@Override
	int Locate(E e) {
		// TODO Auto-generated method stub
		if(e == null) {
			System.out.println("Error: can't be null!");
			return -1;
		}
		for(int i = 0; i < size; i++) {
			if(e.toString().equals(data[i].toString())) {
				return i;
			}
		}
		return -1;
	}

	@Override
	boolean Remove(E e) {
		// TODO Auto-generated method stub
		if(e == null) {
			System.out.println("Error: can't be null!");
			return false;
		}
		for(int i = 0; i < size; i++) {
			if(e.toString().equals(data[i].toString())) {
				
			}
		}
		return false;
	}

	@Override
	boolean Remove(int x) {
		// TODO Auto-generated method stub
		int length = size - x - 1;//拷贝长度
		if(isExist(x) && length > 0) {
			System.arraycopy(data, x + 1, data, x, length);
			size--;
		}
		data[size] = null;
		return true;
	}

	@Override
	boolean Insert(int x, E e) {
		// TODO Auto-generated method stub
		int length = size - x - 1;
		ensureBig();
		if(isExist(x) && length > 0) {
			System.arraycopy(data, x, data, x + 1, length);
			data[x] = e;
			size++;
		}
		return false;
	}
	
	private boolean isExist(int x) {
		if(x < 0 || x > size - 1) {
			return false;
		}
		return true;
	}
	
	private void ensureBig() {
		if(size % MAX_SIZE > 1/2 * MAX_SIZE) {
			Object[] obj = new Object[size + MAX_SIZE];
			System.arraycopy(data, 0, obj, 0, size - 1);
		}
	}

}
