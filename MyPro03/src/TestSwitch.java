

/**
 * ����Switch���
 * @author Administrator
 *��ֵ�ж�ʱ�Ƽ�ʹ��switch
 */

public class TestSwitch {
	public static void main(String[] args) {
		
		int month = (int)(1+12*Math.random());
		System.out.println(month);
		
		switch (month) {
		case 1:
			System.out.println("һ�·ݣ������꣡");
			break;
		case 2:
			System.out.println("���·ݣ������ˣ�");
			break;
		default:
			System.out.println("��ͦ�õģ�");
			break;
		}
		
		
		System.out.println("##########################");
		char c = 'a';														//a=97
		int rand = (int)(1+26*Math.random());			//������ɡ�1,26)
		char c1 =(char)(c+rand);									//a+1=b;a+2=c;�Դ�����
		System.out.println(c1+";");
		
		switch (c1) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
			break;
		}
		
	}
}