package cn.sxt.QueueAndDeque;

/**
 * �����Զ����ջ
 * @author Admin
 *
 */
public class StackDome {
	public static void main(String[] args) {
		MyStack<String> backHistory = new MyStack<>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.google.com");
		backHistory.push("www.sine.com");
		backHistory.push("www.sxt.com");
		
		System.out.println("��С��"+backHistory.size());
//����
		String item = null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
	}
}
