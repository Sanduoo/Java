package cn.sxt.Sort.innerType;

import java.util.Arrays;
import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
		
		/*从小到大排序*/
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//假定有序
//			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("第"+(i+1)+"次");
				//Note: Date强制转换为Comparable接口类型
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//第（前）一位与后一位比较
					Date temp = arr[i];				//中间变量
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;				//无序
				}
//				System.out.println(Arrays.toString(arr));
			}
			if (sorted) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
