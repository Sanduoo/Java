
/**
 * ����whileǶ��
 * @author Administrator
 *
 */

public class TestWhileQianTao {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {		
				System.out.print(i+"\t");				//ln����
			}
			System.out.println();
		}
		
		System.out.println("####################");
		/**��ӡ99�˷���**/
		for (int n = 1; n <=9; n++) {				//��ѭ��			
			for (int m = 1; m <=n; m++) {			//��ѭ��			��m>nʱ��������
				System.out.print(m+"*"+n+"="+(m*n)+"\t");
			}
			System.out.println();
		} 
		
		System.out.println("####################");
		/**��100������ż��֮��**/
		int sum01 = 0;
		int sum02 = 0;
		
		for (int i = 0 ;i<=100; i++) {
			if (i % 2==0) {
				System.out.println(sum01=sum01+i);
			}else {
				System.out.println(sum02=sum02+i);
			}
		}
		System.out.println("ż���ͣ�"+sum01);
		System.out.println("�����ͣ�"+sum02);
		
		/**��whileѭ����ӡ0-1000�ܱ�������������ÿ��������**/
		int count = 0;			 //count��Ϊ������ 
		
		for (int i = 1; i <=1000; i++) {
			if (i%5==0) {
				System.out.print(i+"\t");
				count++;
			}
			/*
			if (i%25==0) {
				System.out.println();
			}
			*/
			
			if (count==5) {
				System.out.println();
				count=0;
			}
			
		}
	}
}