package cn.sxt.BubbleSort1;

import java.util.Arrays;

/**
 * ð�������Ż�������������
 * @author Admin
 *
 */
public class BubbleSort3 {
	public static void main(String[] args) {
		int[ ] arr = {9,1,2,3,4};
		bubbleSort(arr);
	}
	
	/*ð������*/
	public static void bubbleSort(int[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
				System.out.print("��"+(i+1)+"��");
				if (arr[i]>arr[i+1]) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					int temp = arr[i];				//�м����
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;				//����
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
