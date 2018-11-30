package cn.sxt.File;

import java.io.File;
import java.io.IOException;

/**
 * 测试File类
 * @author Admin
 *
 */
public class TestFile {
	public static void main(String[] args) {
		
		/**文件、目录名的抽象的代表**/
		File file = new File("C:/Users/JC/Desktop/捕捉.JPG");				//file表示C:/Users/JC/Desktop中的捕捉.jpg文件
		File file2 = new File("C:/Users/JC/Desktop");							//file2表示C:/Users/JC/Desktop目录
		File file3 = new File(file2,"捕捉2.JPG");									//file3表示C:/Users/JC/Desktop/捕捉2.jpg文件
		
		/**创建目录**/
		File file5 = new File("C:/Users/JC/Desktop/aaa/bbb");
//		file5.mkdir();			//前面的目录（aaa）存在就创建文件夹（bbb）；若不存在就不创建
		file5.mkdirs();
		
		/**创建文件**/
		File file4 = new File(file2,"捕捉9.JPG");
		try {
			file4.createNewFile();
			file4.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**判断是file否是一个文件**/
		if (file.isFile()) {
			System.out.println("是一个文件");
		}
		
		/**判断是file2否是一个目录**/
		if (file2.isDirectory()) {
			System.out.println("是一个目录");
		}
		
	}
}
