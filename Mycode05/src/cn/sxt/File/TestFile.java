package cn.sxt.File;

import java.io.File;
import java.io.IOException;

/**
 * ����File��
 * @author Admin
 *
 */
public class TestFile {
	public static void main(String[] args) {
		
		/**�ļ���Ŀ¼���ĳ���Ĵ���**/
		File file = new File("C:/Users/JC/Desktop/��׽.JPG");				//file��ʾC:/Users/JC/Desktop�еĲ�׽.jpg�ļ�
		File file2 = new File("C:/Users/JC/Desktop");							//file2��ʾC:/Users/JC/DesktopĿ¼
		File file3 = new File(file2,"��׽2.JPG");									//file3��ʾC:/Users/JC/Desktop/��׽2.jpg�ļ�
		
		/**����Ŀ¼**/
		File file5 = new File("C:/Users/JC/Desktop/aaa/bbb");
//		file5.mkdir();			//ǰ���Ŀ¼��aaa�����ھʹ����ļ��У�bbb�����������ھͲ�����
		file5.mkdirs();
		
		/**�����ļ�**/
		File file4 = new File(file2,"��׽9.JPG");
		try {
			file4.createNewFile();
			file4.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**�ж���file����һ���ļ�**/
		if (file.isFile()) {
			System.out.println("��һ���ļ�");
		}
		
		/**�ж���file2����һ��Ŀ¼**/
		if (file2.isDirectory()) {
			System.out.println("��һ��Ŀ¼");
		}
		
	}
}
