package cn.sxt.WrappedClass;

/**
 * ���԰�װ��
 * @author Admin
 *
 */
public class TestWarppedClass {
	public static void main(String[] args) {
		
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);				//Integer�����ֵ
		System.out.println(Integer.toHexString(i));				//i��16������ֵ
		Integer i2 = Integer.parseInt("234");						//����һ������
		Integer i3 = new Integer("333");							
		System.out.println(i2.intValue());							//int.Value����Integer����תΪint
		System.out.println(i3);
		
		String str = 234+"";
		System.out.println(str);
	}
}
