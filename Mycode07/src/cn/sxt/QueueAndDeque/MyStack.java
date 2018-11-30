package cn.sxt.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ʹ�ö���ʵ���Զ����ջ
 * 1����
 * 2��ѹ
 * 3����ȡͷ
 * @author Admin
 *
 * @param <E>
 */
public class MyStack<E> {
//	����
	private Deque<E> container = new ArrayDeque<>();
//	����
	private int cap;
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
//	ѹջ
	public boolean push(E e) {
		if (container.size()+1>cap) {				//�ж�����
			return false;
		}
		return container.offerLast(e);				//����ջ�����
	}
//	��ջ
	public E pop() {
		return container.pollLast();
	}
//	��ȡ
	public E peek() {
		return container.peekLast();
	}
//	��ȡ����
	public int size() {
		return container.size();
	}
}
