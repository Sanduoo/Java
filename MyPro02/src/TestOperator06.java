
/**
 * �������������Ԫ�������
 * @author Administrator
 *
 */

public class TestOperator06 {
	public static void main(String[] args) {
		
		int score = 80;
		int x = -100;
		String type = score <60?"������":"����";				//boolean score <60 is true ��� ������score < 60 is false ��� ����
		System.out.println(type);
		
		if (score <60) {
			System.out.println("������");
		}else {
			System.out.println("����");
		}
		
		System.out.println(x >0 ? 1 : (x == 0 ? 0 : -1));				//X>0���1��X==0���0��X<0���-1
		
	}
}
