
/**
 * ����continue
 * ���ڽ�������ѭ����������һ��ѭ��
 * @author Administrator
 *
 */

public class TestContinue {
	public static void main(String[] args) {
		
		/*���100-150֮�䲻�ܱ�3����������5��һ��*/
		int count = 0;
		for (int i = 100;i<=150;i++) {
			if (i%3==0) {				//i��3��������������ѭ��������һ��ѭ��
				continue;
			}else {
				System.out.print(i+"\t");				//���ܱ�3�������������count++
				count++;
			}
			if (count==5) { 				//��count=5ʱ���У�����0count
				System.out.println();
				count=0;
			}	

		}
	}
}
