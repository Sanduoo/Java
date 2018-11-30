import javax.print.attribute.standard.MediaName;

/**
 * 测试参数传值机制
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
		u.name = "许二多";
	}
	
	public void testParameterTransfer02(User4 u) {
		u = new User4(101, "许四多") ;								//许四多u的地址和许二多u的地址一样所以输出都为许二多
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100, "许三多");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
	}
}
