package cn.sxt.Sort.innerType;
//157  03
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * ���򹤾���	
 * @author Admin
 *
 */
public class Utils {
	
	/*List������+�Ƚ���*/
	public static <T>void sort(List<T> list,Comparator<T> com) {
		//��һ����ת������
		Object[] arr = list.toArray();
		sort(arr,com);
		//�ڶ������ı������ж�Ӧ��ֵ
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)(arr[i]));
		}
//		System.out.println(list);
	}
	
	/*�������򣨽���)+Comparator�ӿ�*/
	public static void sort(Object[] arr,Comparator com) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("��"+(i+1)+"��");
				//Note: Dateǿ��ת��ΪComparable�ӿ�����
				if (com.compare(arr[i],arr[i+1])>0) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					Object temp = arr[i];				//�м����
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
	
	
	/*��������ʹ�÷��ͷ�����*/
	public static <T extends Comparable<T>>void sort(List<T> list) {
		//��һ����ת������
		Object[] arr = list.toArray();
		sort(arr);
		//�ڶ������ı������ж�Ӧ��ֵ
		for (int i = 0; i < arr.length; i++) {
			list.set(i, (T)(arr[i]));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/*��������ʹ�÷��ͷ�����*/
	public static <T extends Comparable<T>>void sort(T[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("��"+(i+1)+"��");
				//Note: Dateǿ��ת��ΪComparable�ӿ�����
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					T temp = arr[i];				//�м����
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
	/*�������򣨽���)*/
	public static void sort(Object[] arr) {
		boolean sorted = true;
		for (int j = 0; j < arr.length-1; j++) {
			sorted =true;				//�ٶ�����
//			System.out.println("\t"+"��"+(j+1)+"��");
			for (int i = 0; i < arr.length-1-j; i++) {
//				System.out.print("��"+(i+1)+"��");
				//Note: Dateǿ��ת��ΪComparable�ӿ�����
				if (((Comparable)arr[i]).compareTo(arr[i+1])>0) {				//�ڣ�ǰ��һλ���һλ�Ƚ�
					Object temp = arr[i];				//�м����
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
