package cn.sxt.Array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int [ ] a = {1,2,323,23,543,12,59};
		
		/**遍历数组的两种方法**/
		for(int m : a) {				//i : a ; i为临时变量用来指代要遍历的元素
			System.out.println(m);
		}
		
		for (int i = 0; i < a.length; i++) {
			int m = a[i];
			System.out.println(m);
		}
		
	}
}
