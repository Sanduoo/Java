package cn.sxt.arrays;

/**
 * ������������ֳ�ʼ����ʽ
 * @author Admin
 *
 */

public class Test02 {
	public static void main(String[] args) {
		
		/**��̬��ʼ��**/
		int[] a = {2,4,56};
		User01[] b = {
								new User01(1001, "����"),
								new User01(1002, "�Ķ�"),
								new User01(1003, "���")
							};
		
		/**Ĭ�ϳ�ʼ��**/
		int[] b1 = new int[3];				//Ĭ�ϸ�����Ԫ�ظ�ֵ����ֵ�Ĺ���ͳ�Ա������ֵ����һ��
		
		//��̬��ʼ��
		int[] a1 = new int[2];				//��̬��ʼ�����飬�ȷ���ռ䣻
		a1[0]=1;								//������Ԫ�ظ�ֵ
		a1[1]=2;								//������Ԫ�ظ�ֵ
		
	}
}
