package cn.sxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 典型代码
 * @author Admin
 *
 */
public class TestTryCatch {
	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			reader = new FileReader("d:/a.txt");
			char temp = (char) reader.read();				//reader.read()  读一个字符
			char temp2 = (char)reader.read();				//读下一个字符
			char temp3 = (char) reader.read();
			char temp4 = (char) reader.read();
			char temp5 = (char) reader.read();
			char temp6 = (char) reader.read();
			char temp7 = (char) reader.read();
			char temp8 = (char) reader.read();
			System.out.println("读出内容："+temp+temp2+temp3+temp4+temp5+temp6+temp7+temp8);
		/**若文件不存在**/
		} catch (FileNotFoundException e) {				//catch: 可以捕获多个异常；若异常类有继承关系，越是顶层的类，越放在下面（FileNotFoundException是IOException的子类）
			System.out.println("文件没有找到！！！");
			e.printStackTrace();
		/**若读取文件错误**/
		}catch (IOException e) {
			System.out.println("读取文件错误！！！");
		}finally {				//finaly: 中存放关闭资源的代码
			System.out.println("不管有没有异常，我肯定会执行！！！");
			try {
				if (reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
