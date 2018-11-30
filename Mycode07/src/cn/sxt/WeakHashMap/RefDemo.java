package cn.sxt.WeakHashMap;

import java.lang.ref.WeakReference;

/**
 * ���÷��ࣺǿ����������
 * ǿ��������
 * @author Admin
 *
 */
public class RefDemo {
	public static void main(String[] args) {
//		�ַ���������
		String str = new String("SanDuoo is good boy");
//		�����ù������
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("cg����ǰ"+wr.get());
//		�Ͽ�����
		str = null;
//		����֪ͨ
		System.gc();
		System.runFinalization();
//		���󱻻���
		System.out.println("cg���к�"+wr.get());
	}
	public static void testStrong() {
//		�ַ��������ع����ܻ���
		String str = "SanDuoo is good boy";
//		�����ù������
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("cg����ǰ"+wr.get());
//		�Ͽ�����
		str = null;
//		����֪ͨ
		System.gc();
		System.runFinalization();
		System.out.println("cg���к�"+wr.get());
	}
}
