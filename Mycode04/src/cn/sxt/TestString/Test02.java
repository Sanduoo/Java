package cn.sxt.TestString;
/**
 * ����StringBuilder�ĳ��÷���
 * @author Admin
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstvuwxyz");
		
		/**ɾ�������͵�����ַ�**/
		sb.delete(3,5).delete(3, 5);
		System.out.println(sb);
		
		/**��ת**/
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
	}
}
