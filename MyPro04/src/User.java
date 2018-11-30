
public class User {									//成员变量
	int id;
	String name;
	String pwd;
	public User() {
		
	}
	
	public User(int id,String name) {			//局部变量
		super();
		this.id = id;										//this表示创建好的成员变量，用this调用成员变量
		this.name = name;
	}
	
	public User (int id,String name,String pwd) {
		this.id  = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101,"许三多");
		User u3 = new User(102,"赵铁柱","123456"); 
	}
	
}
