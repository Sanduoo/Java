import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * ����ifelse˫ѡ��ṹ
 * @author Administrator
 *
 */

public class Testifelse {
	public static void main(String[] args) {
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		
		if (h<=3) {
			System.out.println("С");
		} else {
			System.out.println("��");
		}
		
		System.out.println("##############");
		/**�������һ��[0.0,4.0)�뾶��Բ����Բ��������ܳ�*/
		//Note: double r = 4*Math.random();

		String str;
		double r;
		str=JOptionPane.showInputDialog("������Բ�İ뾶r");				//�����ı���"������Բ�İ뾶r"
		r=Double.parseDouble(str);
		
		double area = 3.14*Math.pow(r, 2);				//Math.pow(a,b):a��b�η�
		double circle = 2*3.14*r;
		
		System.out.println("�뾶��"+r);
		System.out.println("�ܳ���"+circle);
		System.out.println("�����"+area);
		
	}
}
