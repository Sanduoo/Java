package cn.sxt.stringbuilder;
/**
 * 测试可变字符序列（StringBuilder(线程不安全效率高),StringBuffer(线程安全效率低)）
 * @author Admin
 *
 */
public class Test01  {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();				//字符数组长度初始为16
		StringBuilder sb1 = new StringBuilder(32);				//字符数组长度初始为32
		StringBuilder sb2 = new StringBuilder("abcd");				//字符数组长度初始为23，value[ ]={'a','b','c','d',/u0000,/u0000...}
		sb2.append("efg");														//字符数组长度初始为22，value[ ] = {'a','b','c','d','e','f','g',/u0000,/u0000...}

		sb2.append(true).append(321).append("随便");				//通过return this 实现方法链 
			
		System.out.println(sb2);				//abcdefgtrue
		
		StringBuilder gh = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			gh.append(i);
		}
		System.out.println(gh);
	}
}
