import java.util.Scanner;

/**
 * 测试获得键盘输入
 * @author Administrator
 *
 */

public class TestScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = scanner.nextLine();				//nextLine   获得输入的那一行文字
		System.out.println("请输入你的爱好：");
		String favor = scanner.nextLine();
		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();
		
		System.out.println("################");
		
		System.out.println("姓名："+name);
		System.out.println("爱好："+favor);
		System.out.println("年龄："+age);
		System.out.println("来到地球的天数"+age*365);
		System.out.println("离开地球的天数"+(72-age)*365);
		
	}
}
