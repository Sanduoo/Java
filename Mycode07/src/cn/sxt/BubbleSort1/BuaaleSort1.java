package cn.sxt.BubbleSort1;

import java.util.Arrays;

/**
 * ð�����򣨳�����
 * @author Admin
 *
 */
public class BuaaleSort1 {
	
	public static void main(String[] args) {
		int[ ] arr = {9,8,7,6,5};
//		sort(arr);
		bubbleSort(arr);
	}
	
	/*ð������*/
	public static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length-1; j++) {
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1; i++) {
//				System.out.print("��"+(i+1)+"��");
				if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
				int temp = arr[i];				//�м����
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("\t"+Arrays.toString(arr));
	}
	
	/*ð������ԭ��*/
	public static void sort(int[] arr) {
		System.out.println("\t"+"��һ��");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("��"+(i+1)+"��");
			if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"�ڶ���");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("��"+(i+1)+"��");
			if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"������");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("��"+(i+1)+"��");
			if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		
		System.out.println("\t"+"������");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print("��"+(i+1)+"��");
			if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
			System.out.println("\t"+Arrays.toString(arr));
		}
		//��һ�� �Ƚ�
/*
		System.out.println("��һ�� ��һ��");
		int i = 0;
		if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("��һ�� �ڶ���");
		i++;
		if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("��һ�� ������");
		i++;
		if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
				
		System.out.println("��һ�� ���Ĵ�");
		i++;
		if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
			int temp = arr[i];				//�м����
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
*/
	}
}
