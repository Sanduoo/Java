package cn.sxt.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ʹ�ö���ģ�����д��ҵ��
 * @author Admin
 *
 */
public class QueueDome {
	public static void main(String[] args) {
		Queue<Request> que = new ArrayDeque<>();
//		ģ���Ŷ����
		for (int i = 0; i < 10; i++) {
			final int num = i;
			que.offer(new Request() {
				@Override
				public void deposit() {
					System.out.println("��"+num+"���ˣ�������ҵ�񣬴����Ϊ��"+Math.random()*10000);				//�����ڲ���ֻ�ܷ���final���εĶ���
				}
			}
					);
		}
		dealWith(que);
	}
//	����ҵ��
	public static void dealWith(Queue<Request> que) {
		Request req = null;
		while (null !=(req = que.poll())) {
			req.deposit();
		}
	}
}

interface Request{
//	���
	void deposit();
}