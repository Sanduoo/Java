package cn.sxt.Sort.innerType;
//157  03
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * 排序工具类	
 * @author Admin
 *
 */
public class Utils {
	
	/*List的排序+比较器*/
	public static <T>void sort(List<T> list,Comparator<T> com) {
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr,com);
		//第二步：改变容器中对应的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)(arr[i]));
		}
//		System.out.println(list);
	}
	
	/*数组排序（降序)+Comparator接口*/
	public static void sort(Object[] arr,Comparator com) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//假定有序
//			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("第"+(i+1)+"次");
				//Note: Date强制转换为Comparable接口类型
				if (com.compare(arr[i],arr[i+1])>0) {				//第（前）一位与后一位比较
					Object temp = arr[i];				//中间变量
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
	
	
	/*容器排序（使用泛型方法）*/
	public static <T extends Comparable<T>>void sort(List<T> list) {
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr);
		//第二步：改变容器中对应的值
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)(arr[i]));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/*数组排序（使用泛型方法）*/
	public static <T extends Comparable<T>>void sort(T[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//假定有序
//			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("第"+(i+1)+"次");
				//Note: Date强制转换为Comparable接口类型
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//第（前）一位与后一位比较
					T temp = arr[i];				//中间变量
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
	/*数组排序（降序)*/
	public static void sort(Object[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//假定有序
//			System.out.println("\t"+"第"+(j+1)+"趟");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("第"+(i+1)+"次");
				//Note: Date强制转换为Comparable接口类型
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//第（前）一位与后一位比较
					Object temp = arr[i];				//中间变量
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
