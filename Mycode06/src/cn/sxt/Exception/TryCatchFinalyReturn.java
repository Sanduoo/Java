package cn.sxt.Exception;

/**
 * ̽��try,catch,finaly,return��ִ��˳��
 * 
 * 1.ִ��try,catch��������ֵ��ֵ
 * 2.ִ��finaly
 * 3.return
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinalyReturn {
	public static void main(String[] args) {
		
		String string = new TryCatchFinalyReturn().openFile();
		System.out.println(string);
			
	}
	
	String openFile() {
		try {
			System.out.println("��һ��");
			FileInputStream file = new FileInputStream("d:/a.txt");
			int a = file.read();
			System.out.println("�ڶ���");
			return"step1";
		} catch (FileNotFoundException e ) {
			System.out.println("catching!!!");
			e.printStackTrace();
			return"step2";
		}catch (IOException e) {
			e.printStackTrace();
			return"step3";
		}finally {
			System.out.println("finaly!!!");
//			return"step finaly";				//��Ҫ��finaly��ʹ��return���Ḳ��֮ǰ��return
		}
		
	}
	
}