
/**
 * ���Ծ�̬��ʼ�����ʹ��
 * @author Administrator
 *
 */

public class User3 {
	int id;									//id
	String name;							//�˻���
	String pwd;							//����
	static String company;			//��˾����

	static {																				//��static���ε����飬�����ʼ��ʱִ��
		System.out.println("ִ����ĳ�ʼ������");
		company = "������ѧ��";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User3 u3 = null;
	}
	
	
}
