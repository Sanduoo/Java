
/**
 * ���Եݹ�
 * @author Administrator
 *
 */

public class TestRecursion01 {
	public static void main(String[] args) {
		
		a();
		b();
	}
	
	static int count = 0;
	static void a() {
		
		System.out.println("a");
		if (count<10) {				//�ݹ�ͷ
			count++;
			a();
		}else {							//�ݹ���
			return;
		}
	}
	
	static void b() {
		System.out.println("b");
	}
	
}
