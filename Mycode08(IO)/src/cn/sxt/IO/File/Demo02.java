package cn.sxt.IO.File;

import java.io.File;

/**
 * ���·�������·������File����
 * 1�����·��
 * 		File��String parent��String child��==>File��"E:/others"��"1.txt"��
 * 		File ��File parent��String child��==>File ��new File��"E:/others"����"1.txt"��
 * @author Admin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		String parentPath = "E:/others";
		String name = "1.txt";
//		���·��
		File src = new File(parentPath);
		src = new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src.getPath());
//		����·��
		System.out.println("======");
		src = new File("E:/others/1.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
//		û���̷�  ����user.dir����
		System.out.println("######");
		src  = new  File("Test.txt");
		src = new File(".");				//���ʾ��ǰ·��
		System.out.println(src.getName());				//��������
		System.out.println(src.getPath());				//����Ǿ���·������������·�����������·��
		System.out.println(src.getAbsolutePath());				//���ؾ���·����������·����
	}
}
