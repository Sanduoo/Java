package cn.sxt.BubbleSort1;

import java.util.Arrays;

/**
 * ð�������Ż����������������
 * @author Admin
 *
 */
public class BubbleSort2 {
	public static void main(String[] args) {
		int[ ] arr = {9,8,7,6,5};
//		sort(arr);
		bubbleSort(arr);
	}
	
	/*ð������*/
	public static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length-1; j++) {
			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
				System.out.print("��"+(i+1)+"��");
				if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
				int temp = arr[i];				//�м����
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		System.out.println("\t"+Arrays.toString(arr));
	}
	
}
