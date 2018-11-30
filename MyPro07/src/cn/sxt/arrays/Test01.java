package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
		
		int[] arr01 = new int[10];												//声明一个整数数组,长度是10
		String arr02[] = new String[5];

		
		arr01[0] = 13;																	//下标索引[0,length-1]0,1,2,3,4,5,6,7,8,9
		arr01[1] = 15;
		arr01[2] = 20;
		/*		arr01[10] = 100;	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10	数组索引越界 */
		
		//Note: 通过循环初始化数组
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = 10*i;
		}
		
		//Note: 通过循环读取数组里面元素的值
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);;
		}
		
		User01[] arr03 = new User01[3];
		arr03[0] = new User01(1001,"三多");
		arr03[1] = new User01(1002,"四多");
		arr03[2] = new User01(1003,"五多");
		
		for(int i=0;i<arr03.length;i++) {
			System.out.println(arr03[i].getName());
		}
	}
}

