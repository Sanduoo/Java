

/**
 *���Գ���
 * @author Administrator
 *
 */

public class TestConstant {
	public static void main(String[] args) {
		int age = 18;
		final String name = "gaoqi";
		/*name = "�ڷ�";*/
		System.out.print(name);
		
/*
 * exp2
 */
		//Note: PI = 3.14;PI��final�����������Σ������ٱ���ֵ
		final double PI =3.14;
		double r = 4;
		double area = PI * r * r;					//Բ�����
		double circle = 2 * PI * r;				//Բ���ܳ�
		System.out.println("area = "+ area);
		System.out.println("circle = "+ circle);
		
	}
}
