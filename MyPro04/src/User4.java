import javax.print.attribute.standard.MediaName;

/**
 * ���Բ�����ֵ����
 * @author Administrator
 *
 */

public class User4 {
	int id;
	String name;
	String pwd;
	
	public User4(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(User4 u) {
		u.name = "�����";
	}
	
	public void testParameterTransfer02(User4 u) {
		u = new User4(101, "���Ķ�") ;								//���Ķ�u�ĵ�ַ�������u�ĵ�ַһ�����������Ϊ�����
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100, "������");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
	}
}
