package cn.sxt.oo2;

/**
 * 
 * @author Administrator
 *
 */

public class TestObject {
	public static void main(String[] args) {
		
		/**Object object;*/
		
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("�ڷ�", 19);
		System.out.println(p2);
	}
	
	/**��дtoString����**/
	public String toString() {
		return "����Object����";
	}
}


class Person2{
	String name;
	int age;
	
	@Override  				//������дע���ʶ
	public String toString() {
		return name+"�����䣺"+age;
	}
	
	public Person2(String name,int age) {
		this.age = age;
		this.name = name;
	}
}
