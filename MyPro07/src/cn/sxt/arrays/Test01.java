package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
		
		int[] arr01 = new int[10];												//����һ����������,������10
		String arr02[] = new String[5];

		
		arr01[0] = 13;																	//�±�����[0,length-1]0,1,2,3,4,5,6,7,8,9
		arr01[1] = 15;
		arr01[2] = 20;
		/*		arr01[10] = 100;	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10	��������Խ�� */
		
		//Note: ͨ��ѭ����ʼ������
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = 10*i;
		}
		
		//Note: ͨ��ѭ����ȡ��������Ԫ�ص�ֵ
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);;
		}
		
		User01[] arr03 = new User01[3];
		arr03[0] = new User01(1001,"����");
		arr03[1] = new User01(1002,"�Ķ�");
		arr03[2] = new User01(1003,"���");
		
		for(int i=0;i<arr03.length;i++) {
			System.out.println(arr03[i].getName());
		}
	}
}

