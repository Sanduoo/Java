
/**
 * ����forѭ��
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
		 * 1.ִ�г�ʼ�����i=1
		 * 2.�ж�����i<=100
		 * 3.ִ��ѭ����sum =sum+i
		 * 4.��������i++
		 * 5.�ص��ڶ��������ж�
		 */
		
		/*	","�����ʾ��   */
		for (int i = 1, j=i+10 ; i < 5; i++,j=i*2) {				//��ʼ��i=1��j=i+10		�����ж�i<5		ѭ����j=i*2		��������i++
			System.out.println("i = "+i+"j = "+j);
		}
		for (;;) {				//while(true){
			System.out.println("����զ�Σ�");
		}
		
	}
}