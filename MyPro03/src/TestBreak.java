
/**
 * 测试循环语句中的break
 * @author Administrator
 *
 */

public class TestBreak {
	public static void main(String[] args) {
		
		int total = 0;				//total作为计数器
		System.out.println("Begin");
		
		while (true) {
			total++;
			int i = (int)Math.round(100*Math.random());				//随机生成一个100以内的随机数
			System.out.println(i);
			if (i==88) {
				break;
			}
		}
		
		System.out.println("GameOver , used "+total+"time");
		
	}
}
