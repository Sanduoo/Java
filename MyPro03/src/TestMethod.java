
/**
 *  ���Է����Ļ���ʹ��
 * @author Administrator
 *
 */

public class TestMethod {
	public static void main(String[] args) {
		
		//Note: ͨ��new�����µĶ���
		TestMethod tm = new TestMethod();
		
		tm.printSxt();				//ͨ���¶���tm�����÷���
		
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c);
	}
	
	void printSxt() {
		System.out.println("�����Ͱ�ϴ�룡");
		System.out.println("�����Ͱ�������");
		System.out.println("�����Ͱ��ɻ");
		System.out.println("�����Ͱ�����Ϸ��");
	}
	
	int add(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum;
	}
	
}
