
/**
 * 带标签的break和continue
 * @author Administrator
 *
 */

public class TestLabelContinue {
	public static void main(String[] args) {
		
	/**打印100-150之间所有的质数*/
		outer:for (int i = 100; i <= 150; i++) {
			for (int j = 2; j <= i/2; j++) {
				if (i % j ==0) {
					continue outer;
				}
			}
			System.out.println( i+" ");
		}
		
	}
}
