package cn.sxt.BubbleSort1;

import java.util.Arrays;

/**
 * 冒泡排序优化——减少趟数
 * @author Admin
 *
 */
public class BubbleSort3 {
	public static void main(String[] args) {
		int[ ] arr = {9,1,2,3,4};
		bubbleSort(arr);
	}
	
	/*冒泡排序*/
	public static void bubbleSort(int[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//假定有序
			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1-j; i++) {
				System.out.print("第"+(i+1)+"次");
				if (arr[i]>arr[i+1]) {				//第（前）一位与后一位比较
					int temp = arr[i];				//中间变量
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;				//无序
				}
				System.out.println(Arrays.toString(arr));
			}
			if (sorted) {
				break;
			}
		}
//		System.out.println("\t"+Arrays.toString(arr));
	}
	
}
