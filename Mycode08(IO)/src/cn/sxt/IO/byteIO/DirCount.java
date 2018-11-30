package cn.sxt.IO.byteIO;

import java.io.File;

/**
 * ʹ����������ȡ�ļ��еĴ�С
 * �ݹ飺�ļ����е��ļ����
 * @author Administrator
 *
 */
public class DirCount {
	//��С
	private long len;
	//�ļ���
	private String path;
	//Դ
	private File src;
	//�ļ�����
	private int FileSize;
	//�ļ��и���
	private int DirSize;
	
	public DirCount(String path) {
		this.path=path;
		this.src=new File(path);
		count(this.src);
	}
	
	public static void main(String[] args) {
		DirCount dir= new DirCount("C:\\WeChat Files");
		System.out.println(dir.getLen()+"-->"+dir.getFileSize()+"-->"+dir.getDirSize());
	}
	
	private  void count(File src) {
		if (null!=src&&src.exists()) {
			if (src.isFile()) {
				len+=src.length();
				FileSize++;
			}else {
				for(File s:src.listFiles()) {
					count(s);
					DirSize++;
				}
			}
		}
//		System.out.println(len);
	}

	public long getLen() {
		return len;
	}

	public int getFileSize() {
		return FileSize;
	}

	public int getDirSize() {
		return DirSize;
	}
	
}
