package cn.sxt.arrays;

/**
 * ��������ı���
 * @author Admin
 *
 */

public class Test03 {
	public static void main(String[] args) {
		
		int[] a = new int[4];
		
		/**��ʼ������Ԫ�ص�ֵ**/
		for (int i = 0; i < a.length; i++) {
			a[i] = i*100;
		}
		
		/**��ȡ�����ֵ**/
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("##################");
		//Note: for-eachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
		for(int m : a) {
			System.out.println(m);
		}
		
		String[] ss = {"aa","bbb","ccc","ddd"};
		for(String temp : ss) {
			System.out.println(temp);
		}
		
	}
}
