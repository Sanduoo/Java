
public class User {									//��Ա����
	int id;
	String name;
	String pwd;
	public User() {
		
	}
	
	public User(int id,String name) {			//�ֲ�����
		super();
		this.id = id;										//this��ʾ�����õĳ�Ա��������this���ó�Ա����
		this.name = name;
	}
	
	public User (int id,String name,String pwd) {
		this.id  = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101,"������");
		User u3 = new User(102,"������","123456"); 
	}
	
}
