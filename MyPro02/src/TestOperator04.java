
/**
 * λ�����
 * @author Administrator
 *
 */

public class TestOperator04 {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		System.out.println(a&b);				//�����
		System.out.println(a|b);					//�����
		System.out.println(a^b);				//������
		System.out.println(~a);					//ȡ��
		
		/**��λ����*/
		int c = 3<<2;
		System.out.println(c);					//3<<2=3*2*2
		System.out.println(12>>2);			//12>>2=12/2/2
		
	}
}
