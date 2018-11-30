
/*
 * �����ͱ���
 */

/*
 * float��double�������⣺
 * 
 * һ����Χ
 * float��double�ķ�Χ����ָ����λ���������ġ� 
	float��ָ��λ��8λ����double��ָ��λ��11λ���ֲ����£� 
	float�� 
	1bit������λ�� 
	8bits��ָ��λ�� 
	23bits��β��λ�� 
	double�� 
	1bit������λ��
	11bits��ָ��λ�� 
	52bits��β��λ��
	
	��������
	float��double�ľ�������β����λ���������ġ�
	���������ڴ����ǰ���ѧ���������洢�ģ�����������ʼ����һ�������ŵġ�1�����������ǲ���ģ��ʲ��ܶԾ������Ӱ�졣 
	float��2^23 = 8388608��һ����λ������ζ���������7λ��Ч���֣��������ܱ�֤��Ϊ6λ��Ҳ��float�ľ���Ϊ6~7λ��Ч���֣� 
	double��2^52 = 4503599627370496��һ��16λ��ͬ��double�ľ���Ϊ15~16λ�� 
	���������ͣ�float����˫��������(double)�洢 
 */

import java.math.*;

public class TestprimitiveDateType2 {
	public static void main(String[] args) {
		
		float a= 3.14F;
		double b = 6.28;
		double c = 628E-2;				//E-2  =  10^-2 = 0.01
		
		System.out.println("c = "+c);				//C = 628*0.01=6.28
		
		//Note: �������ǲ���ȷ��һ����Ҫ�ñȽϣ�
		float f = 0.1F;
		double d = 1.0/10;
		System.out.println(f==d);				//���Ϊfalse��float����û��double��
		
		float d1 = 423432423F;
		float d2 = d1 + 1;			
		if (d1==d2) {
			System.out.println("d1==d2");				//������Ϊd1==d2��float�ľ���Ϊ6~7λ��Ч���֣�
		}else {
			System.out.println("d1!=d2");
		}
		
		//Note: ʹ�þ�ȷ�ĸ������У��Ƽ�ʹ��BigDecimal
		
		System.out.println("###################");
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);				//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);				//0.500000000000000001
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));
		
	}
}
