
/**
 * ����ѭ������е�break
 * @author Administrator
 *
 */

public class TestBreak {
	public static void main(String[] args) {
		
		int total = 0;				//total��Ϊ������
		System.out.println("Begin");
		
		while (true) {
			total++;
			int i = (int)Math.round(100*Math.random());				//�������һ��100���ڵ������
			System.out.println(i);
			if (i==88) {
				break;
			}
		}
		
		System.out.println("GameOver , used "+total+"time");
		
	}
}