package cn.sxt.Sort.innerType;

import java.util.Arrays;
import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
		
		/*��С��������*/
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("��"+(i+1)+"��");
				//Note: Dateǿ��ת��ΪComparable�ӿ�����
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					Date temp = arr[i];				//�м����
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;				//����
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
