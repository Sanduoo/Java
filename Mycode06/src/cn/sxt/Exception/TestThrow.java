package cn.sxt.Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestThrow {
	public static void main(String[] args) {
		
		File file = new File("d:/a.txt");
		
		if (!file.exists()) {				//如果file不存在（！非  ）
			try {
				throw new FileNotFoundException("Lile can't be found!");				//手动抛出
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
