
/**
 * 测试continue
 * 用于结束本次循环，继续下一次循环
 * @author Administrator
 *
 */

public class TestContinue {
	public static void main(String[] args) {
		
		/*输出100-150之间不能被3整除的数，5个一行*/
		int count = 0;
		for (int i = 100;i<=150;i++) {
			if (i%3==0) {				//i被3整除，结束本次循环进行下一次循环
				continue;
			}else {
				System.out.print(i+"\t");				//不能被3整除输出该数，count++
				count++;
			}
			if (count==5) { 				//当count=5时换行，并清0count
				System.out.println();
				count=0;
			}	

		}
	}
}
