package cn.sxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * throw
 * @author Admin
 *
 */

public class TestThrows {
	public static void main(String[] args) throws FileNotFoundException, IOException {				//甩锅给JRE
		
		String string;
		string = new TestThrows().openFile();
		System.out.println(string);
			
	}
	
		String openFile() throws FileNotFoundException,IOException {				//throws FileNotFoundException: 方法可能出现异常，谁调用这个方法谁就来处理这个异常；在方法中加try-catch
			FileReader reader = new FileReader("d:/a.txt");
			char c = (char)reader.read();
			System.out.println(c);
			return""+c;
		}
		
}
