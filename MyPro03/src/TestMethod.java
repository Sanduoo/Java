
/**
 *  测试方法的基本使用
 * @author Administrator
 *
 */

public class TestMethod {
	public static void main(String[] args) {
		
		//Note: 通过new创建新的对象
		TestMethod tm = new TestMethod();
		
		tm.printSxt();				//通过新对象tm来调用方法
		
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c);
	}
	
	void printSxt() {
		System.out.println("冯绍贤爱洗碗！");
		System.out.println("冯绍贤爱做饭！");
		System.out.println("冯绍贤爱干活！");
		System.out.println("冯绍贤爱打游戏！");
	}
	
	int add(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum;
	}
	
}
