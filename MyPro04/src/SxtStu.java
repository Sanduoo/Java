
/**
 * �����Ͷ���/ʵ��
 * @author Administrator
 *
 */

public class SxtStu {
	
	/**����fields**/
	int id;
	int age;
	String name;
	Computer comp;
	
	/**����**/
	void study() {
		System.out.println("��������ѧϰ��ʹ�õ��ԣ�"+comp.brand);			//comp�Ƕ������ͨ���� . �������ʶ�����������
	}
	
	void play() {
		System.out.println("��������Ϸ��������̰�٣�");
	}
	
/**
//���췽����ϵͳĬ�ϴ��������ڴ��������Ķ����޲εĹ��������ϵͳ�Զ�����
Student(){				//��Сд����һ��
}
**/

	//Note: main����������ִ�е���ڱ���Ҫ��
	//Note: javac  SxtStu.java                 java SxtStu
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();							//����һ������
		System.out.println(stu);
		stu.play();
		stu.id=1001;
		stu.name="����";
		stu.age=22;
		
		Computer c1 = new Computer();				//����һ��Computer����µĶ���c1�������ַ����������ˡ�����brand
		c1.brand = "��";
		stu.comp = c1;											//��c1��stu��comp
		stu.study();
		
	}
}

class Computer{
	String brand;
}