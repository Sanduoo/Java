package cn.sxt.Fanxing3;

/**
 * ��̬��������̬
 * @author Admin
 *
 */
public class FruitApp {

	public static void main(String[] args) {
		Fruit fruit = new Apple();
		test(new Apple());
	}
	
	//�β�ʹ�ö�̬
	public static void test(Fruit fruit) {
		
	}
	
	//��������ʹ�ö�̬
	public static Fruit test2 () {
		return new Apple();
	}
}
