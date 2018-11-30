package cn.sxt.IO.File;

import java.io.File;
import java.util.Arrays;

/**
 * ������Ｖ�ļ�Ŀ¼|�ļ������ƣ�����·����
 * 1��listFile����
 * 2���ݹ�
 * @author Admin
 * 
 * 
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String path = "C:\\WeChat Files\\1";
		File parent = new File(path);
		printName(parent);
		
		File[ ] roots = File.listRoots();				//���ø�·��
		System.out.println(Arrays.toString(roots));
		for(File temp : roots) {
			printName(temp);
		}
	}
	
//	���·��
	public static void printName(File src) {
		//�ݹ���
		if (null==src || ! src.exists()) {
			return;
		}
		System.out.println(src.getAbsolutePath());
		//�ݹ�ͷ
		if (src.isDirectory()) {				//�ж��Ƿ����ļ���
			for(File sub : src.listFiles()) {
				printName(sub);
			}
		}
	}
}
