package cn.sxt.Array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int [ ] a = {1,2,323,23,543,12,59};
		
		/**������������ַ���**/
		for(int m : a) {				//i : a ; iΪ��ʱ��������ָ��Ҫ������Ԫ��
			System.out.println(m);
		}
		
		for (int i = 0; i < a.length; i++) {
			int m = a[i];
			System.out.println(m);
		}
		
	}
}
