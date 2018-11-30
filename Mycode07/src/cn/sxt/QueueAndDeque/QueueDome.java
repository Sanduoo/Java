package cn.sxt.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 使用队列模拟银行存款业务
 * @author Admin
 *
 */
public class QueueDome {
	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<>();
//		模拟排队情况
		for (int i = 0; i < 10; i++) {
			final int num = i;
			que.offer(new Request() {
				@Override
				public void deposit() {
					System.out.println("第"+num+"个人，办理存款业务，存款额度为："+Math.random()*10000);				//匿名内部类只能访问final修饰的对象
				}
			}
					);
		}
		dealWith(que);
	}
//	处理业务
	public static void dealWith(Queue<Request> que) {
		Request req = null;
		while (null !=(req = que.poll())) {
			req.deposit();
		}
	}
}

interface Request{
//	存款
	void deposit();
}