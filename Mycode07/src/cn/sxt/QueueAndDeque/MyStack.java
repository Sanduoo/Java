package cn.sxt.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 使用队列实现自定义堆栈
 * 1、弹
 * 2、压
 * 3、获取头
 * @author Admin
 *
 * @param <E>
 */
public class MyStack<E> {
//	容器
	private Deque<E> container = new ArrayDeque<>();
//	容量
	private int cap;
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
//	压栈
	public boolean push(E e) {
		if (container.size()+1>cap) {				//判断容量
			return false;
		}
		return container.offerLast(e);				//插入栈的最后
	}
//	弹栈
	public E pop() {
		return container.pollLast();
	}
//	获取
	public E peek() {
		return container.peekLast();
	}
//	获取容量
	public int size() {
		return container.size();
	}
}
