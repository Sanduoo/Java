
/**
 * 测试While循环
 * @author Administrator
 *先判断后执行
 */

/**计算1+2+3+4+.......+100=?**/

public class TestWhile {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;			//保存每次相加的结果
		
		while (i <=100) {
			sum = sum+i;
			i++;
		}
		
		System.out.println(sum);
		
	}
}
