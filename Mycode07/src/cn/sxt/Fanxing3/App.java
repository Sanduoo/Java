package cn.sxt.Fanxing3;

/**
 * 泛型没有多态
 * @author Admin
 *
 */
public class App {

	public static void main(String[] args) {
		//A<Fruit> f = new A<Apple>();
		A<Fruit> f = new A<Fruit>();
	}
	//形参使用多态
		public static void test(Fruit fruit) {
			
		}
		
		//返回类型使用多态
		public static Fruit test2 () {
			//return (A<Fruit>)(new A<Apple>());
			return null;
		}
}
