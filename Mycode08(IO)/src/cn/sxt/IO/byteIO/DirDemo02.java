package cn.sxt.IO.byteIO;

/**
 * 递归：自己调自己
 * 递归头：何时结束
 * 递归体：重复调用
 * @author Administrator
 *
 */
public class DirDemo02 {

	public static void main(String[] args) {
		printTen(1);
	}
	
	public static void printTen(int i) {
		//递归头
		if (i>10) {
			return;
		}
		System.out.println(i);
		printTen(i+1);		//递归体169
	}
}
