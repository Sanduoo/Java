package cn.sxt.Array;

/**
 * ��װ�����õ��㷨
 * @author Admin
 *
 */
public class Matrix {
	
	/**��װһ����ӡָ������ķ���**/
	public static void print(int[ ][ ] c) {
		/**��ӡ����**/
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	/**��װһ���������ӷ�����ķ���**/
	public static int[ ][ ] add(int [ ][ ]a,int[ ][ ]b) {
		
		int[][] c=new int[a.length][a.length];
		//Note: ���ñ������c[ ][ ]�е�����
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
