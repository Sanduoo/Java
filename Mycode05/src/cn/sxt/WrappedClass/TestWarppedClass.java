package cn.sxt.WrappedClass;

/**
 * 测试包装类
 * @author Admin
 *
 */
public class TestWarppedClass {
	public static void main(String[] args) {
		
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);				//Integer的最大值
		System.out.println(Integer.toHexString(i));				//i的16进制数值
		Integer i2 = Integer.parseInt("234");						//传入一个数字
		Integer i3 = new Integer("333");							
		System.out.println(i2.intValue());							//int.Value：把Integer对象转为int
		System.out.println(i3);
		
		String str = 234+"";
		System.out.println(str);
	}
}
