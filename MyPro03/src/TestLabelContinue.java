
/**
 * ����ǩ��break��continue
 * @author Administrator
 *
 */

public class TestLabelContinue {
	public static void main(String[] args) {
		
	/**��ӡ100-150֮�����е�����*/
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
