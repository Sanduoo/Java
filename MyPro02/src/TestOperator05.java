
/**
 * �ַ��������
 * @author Administrator
 *
 */

public class TestOperator05 {
	public static void main(String[] args) {
		
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';
		System.out.println(a+b);				//����ַ���34
		System.out.println(a+c);				//����ַ���35
		
		System.out.println(b+c);				//�����ֵ4+5
		
		System.out.println(a+b+c);			//����ַ���345
		System.out.println(b+c+a);			//�����ֵ4+4���ַ���3
		System.out.println(b+a+c);			//����ַ���435
		
		System.out.println(d+4);				//char�ڼӷ��������������㣬a��ASCII������97,97+4=101
		
		//Note: "+"���ַ���ʱ�����ӷ�������ֵʱ����������
		
	}
}
