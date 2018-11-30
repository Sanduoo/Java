package cn.sxt.QueueAndDeque;

/**
 * 测试自定义堆栈
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
		
		System.out.println("大小："+backHistory.size());
//遍历
		String item = null;
		while (null!=(item=backHistory.pop())) {
			System.out.println(item);
		}
	}
}
