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
	public static void main(String[] args) throws FileNotFoundException, IOException {				//˦����JRE
		
		String string;
		string = new TestThrows().openFile();
		System.out.println(string);
			
	}
	
		String openFile() throws FileNotFoundException,IOException {				//throws FileNotFoundException: �������ܳ����쳣��˭�����������˭������������쳣���ڷ����м�try-catch
			FileReader reader = new FileReader("d:/a.txt");
			char c = (char)reader.read();
			System.out.println(c);
			return""+c;
		}
		
}