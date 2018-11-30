package cn.sxt.arrays;

/**
 * 测试数组的三种初始化方式
 * @author Admin
 *
 */

public class Test02 {
	public static void main(String[] args) {
		
		/**静态初始化**/
		int[] a = {2,4,56};
		User01[] b = {
								new User01(1001, "三多"),
								new User01(1002, "四多"),
								new User01(1003, "五多")
							};
		
		/**默认初始化**/
		int[] b1 = new int[3];				//默认给数组元素赋值。赋值的规则和成员变量赋值规则一致
		
		//动态初始化
		int[] a1 = new int[2];				//动态初始化数组，先分配空间；
		a1[0]=1;								//给数组元素赋值
		a1[1]=2;								//给数组元素赋值
		
	}
}
