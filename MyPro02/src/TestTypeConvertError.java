
/**
 * ǿ������ת����������
 * @author Administrator
 *
 */

public class TestTypeConvertError {
	public static void main(String[] args) {
		
		int money = 1000000000;				//10��
		int years = 20;
		
		int total = money*years;
		System.out.println(total);				//����int�ķ�Χ��totalΪ����
		
		long total1 = money*years;
		System.out.println(total1);				//Ĭ��Ϊint�������Ϊint ����ʱ�����Զ�ʧ������ת��long����
		
		long total2 = money*((long)years);
		System.out.println(total2);				//��һ�����ӱ��long����ʱ���ʽ�Ѿ�������ȫ����long������
		
		
		//Note: ��������L��l��l������1Ū�죬һ����L
		int l = 2;
		long a = 123456l;
		System.out.println(l+1);
		
	}
}
