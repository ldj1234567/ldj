package com.ldj.jiegouUser;

public interface GraphFather {
	int size();
	//����ͼ�Ľڵ����
	boolean isEmpty();
	//�ж�ͼ�Ƿ�Ϊ��
}

class node{
	private String nodeName;

	public node(String nodeName) {
		super();
		this.nodeName = nodeName;
		// TODO Auto-generated constructor stub
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
}