package com.ldj.jiegouUser;

public abstract class LinearListNewUser <E> implements ListNewUser<E> {
	
	
	
	
	public LinearListNewUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	abstract E getData(int x);
	//ȡ��x + 1 ��Ԫ��
	abstract boolean setData(int x, E e);
	//���±�Ϊx��Ԫ��ֵ��Ϊe
	abstract int Locate(E e);
	//����e���±�
	abstract boolean Remove(E e);
	//ɾ����һ��Ԫ��e
	abstract boolean Remove(int x);
	//ɾ���±�Ϊx��Ԫ��
	abstract boolean Insert(int x, E e);
	//���±�Ϊx�ĵط�������Ԫ��e�����Ԫ��˳��
	
}
