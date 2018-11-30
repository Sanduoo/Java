package cn.sxt.Fanxing3;

/**
 * 多态的两种形态
 * @author Admin
 *
 */
public class FruitApp {

	public static void main(String[] args) {
		Fruit fruit = new Apple();
		test(new Apple());
	}
	
	//形参使用多态
	public static void test(Fruit fruit) {
		
	}
	
	//返回类型使用多态
	public static Fruit test2 () {
		return new Apple();
	}
}
