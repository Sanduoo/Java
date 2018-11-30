package cn.sxt.Array;

/**
 * 封装矩阵常用的算法
 * @author Admin
 *
 */
public class Matrix {
	
	/**封装一个打印指定数组的方法**/
	public static void print(int[ ][ ] c) {
		/**打印矩阵**/
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	/**封装一个数组矩阵加法运算的方法**/
	public static int[ ][ ] add(int [ ][ ]a,int[ ][ ]b) {
		
		int[][] c=new int[a.length][a.length];
		//Note: 利用遍历求出c[ ][ ]中的内容
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] =  a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int [ ][ ] a = {
							{1,3,3},
							{2,4,7},
							{6,4,9},
						  };
		
		int [ ][ ] b = {
							{3,3,3},
							{2,4,7},
							{1,4,9},
						  };
		
		int [ ][ ] c = add(a, b);
		
		print(c);
		
		
//		System.out.println(c[0][0]+"\t"+c[0][1]);
//		System.out.println(c[1][0]+"\t"+c[1][1]);

//		  c[0][0] = a[0][0]+b[0][0];
//		  c[0][1] =  a[0][1]+b[0][1];
//		  c[1][0] =  a[1][0]+b[1][0];

	}
}
