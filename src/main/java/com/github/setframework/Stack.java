package com.github.setframework;

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.LinkedList;

/**
 * @ ProjectName: JavaLearn
 * @ Package: com.github.setframework
 * @ ClassName: Stack
 * @ Description: 封装LinkedList，写一个类似栈的数据结构
 * @ Author:
 * @ CreateDate: 2019/4/7 11:37
 * @ UpdateUser:
 * @ UpdateDate: 2019/4/7 11:37
 * @ UpdateRemark:
 * @ Version: 1.0
 */
public class Stack {
	private LinkedList<String> list = new LinkedList<String>();

	public LinkedList<String> Stack(){
		return this.list;
	}
	public void in(String obj){
		list.addLast(obj);
	}

	public Object out(){
		return list.removeLast();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}
}
