package cn.sxt.Sort.innerType;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		String [] arr = {"a","abcd","abc","def"};
		/*��С��������*/
		
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("��"+(i+1)+"��");
				//Note: Stringǿ��ת��ΪComparable�ӿ�����
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					String temp = arr[i];				//�м����
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
