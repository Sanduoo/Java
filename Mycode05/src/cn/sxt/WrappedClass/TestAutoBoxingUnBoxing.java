package cn.sxt.WrappedClass;

/**
 * �����Զ�װ��Ͳ���
 * @author Admin
 *
 */
public class TestAutoBoxingUnBoxing {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;				//�Զ�װ�䣺�������Զ�Integer a = new Integer(1000);
		
		Integer b = 1500;
		int c = b;							//�Զ����䣺�������Զ�b.intValue;
		System.out.println(c);
		
/*		Integer d = null;
		int f = d;
		System.out.println(f);
*/
		
		Integer d = 1234;
		Integer d2= 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));				//equalsֻ�Ƚ����������ֵ
		
		System.out.println("��������");
		
		Integer d3 = 123;
		Integer d4 = 123;
		System.out.println(d3==d4);						//[-128,127]֮��������Ե���������������(int)����
		System.out.println(d3.equals(d4));
		
	}
}
