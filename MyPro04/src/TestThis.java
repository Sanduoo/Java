
/**
 * ������������������this�����־ֲ������ͳ�Ա����
 * @author Administrator
 *this��������static������
 */

public class TestThis {
	
	int a,b,c;							//��Ա����
	
	TestThis(int a,int b){
		this.a = a;						//�ֲ�����
		this.b = b;
	}
	
	TestThis(int a,int b,int c){
		
		this(a, b);						//���ù�����������λ�ڹ��췽���ĵ�һ�䣩
		this.c = c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		
		this.sing(); 						//���ñ����е�sing();
		
		System.out.println("�����躰��ؼҳԷ���");
		
	}
	
	public static void main(String[] args) {
		
		TestThis hi = new TestThis(2, 3);
		hi.eat();
		
	}
	
}
