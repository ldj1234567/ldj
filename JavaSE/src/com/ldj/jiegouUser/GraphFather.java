package com.ldj.jiegouUser;

public interface GraphFather {
	int size();
	//返回图的节点个数
	boolean isEmpty();
	//判断图是否为空
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