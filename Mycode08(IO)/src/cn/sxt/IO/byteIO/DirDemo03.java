package cn.sxt.IO.byteIO;

import java.io.File;

public class DirDemo03 {

	public static void main(String[] args) {
		File src = new File("C:\\WeChat Files");
		printNames(src,0);
	}
	
	//��ӡ���ＶĿ¼���ļ�������
	public static void printNames(File src,int deep) {
		for (int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		System.out.println(src.getName());
		if (null==src ||!src.exists()) {				//�ݹ�ͷ
			return;
		}else if (src.isDirectory()) {
			for(File s:src.listFiles()) {
				printNames(s,deep+1);				//�ݹ���
			}
		}
	}
}
