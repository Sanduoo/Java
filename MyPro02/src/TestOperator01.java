
/**
 * �������������
 * @author Administrator
 *
 */

public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
		
		/*byte c = a+b;*/				//����int �� byte��
		long c2 = b+b2;
		float f1 = 3.1F;
		float d = b+b2;
		
		/*float d2 = f1 + 6.2;*/				//����6.2��double�������double
		
		//Note��ȡ������ȡģ�������������й��������޹�
		System.out.println(9%-5);
		
		/**���������Լ�*/
		int x = 3;
		int y = x++;				//x�ȸ�ֵ������,y=3
		System.out.println("x = "+x+"\ny = "+y);
		x = 3;
		y = ++x;				//x�������ٸ�ֵ,y=4
		System.out.println("x = "+x+"\ny = "+y);
		
		/**��չ�����*/
		int m = 3;
		int n = 4;
		m+=n;				//�൱��m=m+n;m=3+4
		System.out.println("m="+m+"\nn="+n);
		m = 3;
		m*=n+3;				//�൱��m=m*(n+3);m=3*(4+3)
		System.out.println("m="+m+"\nn="+n);
		
	}
}
