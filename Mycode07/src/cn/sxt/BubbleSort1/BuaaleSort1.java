package cn.sxt.BubbleSort1;

import java.util.Arrays;

/**
 * 冒泡排序（初级）
 * @author Admin
 *
 */
public class BuaaleSort1 {
	
	public static void main(String[] args) {
		int[ ] arr = {9,8,7,6,5};
//		sort(arr);
		bubbleSort(arr);
	}
	
	/*冒泡排序*/
	public static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length-1; j++) {
//			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1; i++) {
//				System.out.print("第"+(i+1)+"次");
				if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
				int temp = arr[i];				//中间变量
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("\t"+Arrays.toString(arr));
	}
	
	/*冒泡排序原理*/
	public static void sort(int[] arr) {
		System.out.println("\t"+"第一趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("第"+(i+1)+"次");
			if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"第二趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("第"+(i+1)+"次");
			if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"第三趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("第"+(i+1)+"次");
			if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"第四趟");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("第"+(i+1)+"次");
			if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		//第一趟 比较
/*
		System.out.println("第一趟 第一次");
		int i = 0;
		if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("第一趟 第二次");
		i++;
		if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("第一趟 第三次");
		i++;
		if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("第一趟 第四次");
		i++;
		if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
			int temp = arr[i];				//中间变量
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
*/
	}
}
