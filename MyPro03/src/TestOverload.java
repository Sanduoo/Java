
/**
 * ���Է�������
 * @author Administrator
 *
 */

public class TestOverload {
	public static void main(String[] args) {
		
		System.out.println(add(2, 3));				//int,int
		System.out.println(add(3.0, 2.3));			//double,double
		System.out.println(add(3.2, 2));				//double,int
		System.out.println(add(2, 2.5));				//int,double
		System.out.println(add(2, 3, 4));				//int,int,int
		System.out.println(add(2.3, 2.3));			//double,double
		
		/*�����Ѿ������ķ�������*/
		System.out.println();				//0������
		System.out.println(1);			//������1��int����
		System.out.println(3.2); 		//������1��double����
		
	}
	
	/**��͵ķ���**/
	public static int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	
	//Note: ��������ͬ������������ͬ����������
	public static int add(int n1,int n2,int n3) {
		int sum = n1+n2+n3;
		return sum;
	}
	
	//Note: ��������ͬ���������Ͳ�ͬ����������
	public static double add(double n1,double n2) {
		double sum = n1+n2;
		return sum;
	}
	
	//Note: ��������ͬ������˳��ͬ����������
	public static double add(int n1,double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	//Note: ��������ͬ������˳��ͬ����������
	public static double add(double n1,int n2) {
		double sum = n1 +n2;
		return sum;
	}

					/**
					//�������ֻ�з���ֵ��ͬ�������ɷ�������
					public static double add(int n1,int n2) {
						double sum =n1+n2;
						return sum;
					}
					
					
					//�������ֻ�в������Ʋ�ͬ�������ɷ�������
					public static int add(int n2,int n1) {
						int sum= n1+n2;
						return sum;
					}
					**/
	
}
