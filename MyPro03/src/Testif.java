
/**
 * ����if��ѡ��ṹ
 * @author Administrator
 *
 */

public class Testif {
	public static void main(String[] args) {
		
		/**
		double d = Math.random();				//Math.random()����һ��0-1��������1��֮��������
		System.out.println(d);
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if (i<=3) {
			System.out.println("С");
		}
		**/
		
		/**ͨ�����������ӣ����������������*/
		
		int i = (int)(6*Math.random()+1);
		int j = (int)(6*Math.random()+1);
		int k = (int)(6*Math.random()+1);
		int count = i+j+k;
		
		System.out.println(count);
		
		if (count>15) {
			System.out.println("������������");
		}
		if (count<=15&&count>=10) {
			System.out.println("��������һ��");
		}
		if (count<10) {
			System.out.println("������������ô��");
		}
		
	}
}