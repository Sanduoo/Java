
/**
 * 测试for循环
 * @author Administrator
 *
 */

public class Testfor {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = i+sum;
		}
		System.out.println(sum);
		
		/**
		 * 1.执行初始化语句i=1
		 * 2.判断条件i<=100
		 * 3.执行循环体sum =sum+i
		 * 4.进步迭代i++
		 * 5.回到第二步继续判断
		 */
		
		/*	","运算符示例   */
		for (int i = 1, j=i+10 ; i < 5; i++,j=i*2) {				//初始化i=1，j=i+10		条件判断i<5		循环体j=i*2		进步迭代i++
			System.out.println("i = "+i+"j = "+j);
		}
		for (;;) {				//while(true){
			System.out.println("瞅你咋滴！");
		}
		
	}
}
