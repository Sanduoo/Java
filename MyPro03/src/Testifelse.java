import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 测试ifelse双选择结构
 * @author Administrator
 *
 */

public class Testifelse {
	public static void main(String[] args) {
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		
		if (h<=3) {
			System.out.println("小");
		} else {
			System.out.println("大");
		}
		
		System.out.println("##############");
		/**随机产生一个[0.0,4.0)半径的圆，求圆的面积和周长*/
		//Note: double r = 4*Math.random();

		String str;
		double r;
		str=JOptionPane.showInputDialog("请输入圆的半径r");				//创建文本框，"请输入圆的半径r"
		r=Double.parseDouble(str);
		
		double area = 3.14*Math.pow(r, 2);				//Math.pow(a,b):a的b次方
		double circle = 2*3.14*r;
		
		System.out.println("半径："+r);
		System.out.println("周长："+circle);
		System.out.println("面积："+area);
		
	}
}
