
/*
 * ������������
 */

public class TestPrimitiveDateType {
	public static void main(String[] args) {
		
		/*�������ͱ���*/
		int a = 15;
		int b = 015;				//��0��ͷ�ǰ˽��ƣ�13��
		int c = 0x15;				//��0x��ͷ��ʮ�����ƣ�21��
		int d = 0b1101;		//��0b��ͷ�Ƕ����ƣ�13��
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;						//���ͳ���Ĭ����int����
		long globalPopulation = 7400000000L;		//�����L��ʾ����һ��������long�ĳ���
		
	}
}
