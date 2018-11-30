package cn.sxt.IO.byteIO;

import java.io.File;

/**
 * 使用面向对象获取文件夹的大小
 * 递归：文件夹中的文件相加
 * @author Administrator
 *
 */
public class DirCount {
	//大小
	private long len;
	//文件夹
	private String path;
	//源
	private File src;
	//文件个数
	private int FileSize;
	//文件夹个数
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
