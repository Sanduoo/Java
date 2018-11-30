package cn.sxt.IO.File;

/**
 * 常用方法
 * 1、文件名
 * getName(）文件名、路径名
 * getpath()	路径名
 * getAbsoluteFile()	绝对路径所对应的File对象
 * getAbsolutePath()	绝对路径名
 * getParent()	父目录，相对路径的父目录，可能为空，如：删除本身后的结果
 * 2、判断信息
	exists()		判断是否存在
	canWrite()
	canRead()
	isFile()
	isDirectory()
	isAbsolute()：消除平台差异，ie以盘符开头，其他以/开头
	3、长度 字节数  不能读取文件夹的长度
	length()
	4、创建、删除
	createNewFile() 不存在创建新文件,存在返回false
	delete() 删除文件
	static createTempFile(前缀3个字节长，后缀默认.temp) 默认临时空间
	staticcreateTempFile(前缀3个字节长，后缀默认.temp,目录)
	deleteOnExit() 退出虚拟机删除,常用于删除临时文件
 */
import java.io.File;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		try {
			try {
				test4();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件创建失败");
		}
	}
	public static void test1() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");
		System.out.println(src.getName());						//返回名称
		System.out.println(src.getPath());						//如果是绝对路径，返回完整路径；否则相对路径
		System.out.println(src.getAbsolutePath());			//返回绝对路径（工作区路径） 167-01:57
		System.out.println(src.getParent()); 					//返回上一级目录；如果是相对的，返回null
	}
	
	public static void test2() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");				//File可表示文件和文件夹
		System.out.println("文件是否存在"+src.exists());
		System.out.println("判断是否可写"+src.canWrite());
		System.out.println("判断是否可读"+src.canRead());
		System.out.println("判断是否为文件"+src.isFile());
		System.out.println("判断是否为文件夹"+src.isDirectory());			//如果文件不存在，则默认文件夹
		if (src.isFile()) {
			System.out.println("文件");
		}else {
			if (src.isDirectory()) {
				System.out.println("文件夹");
			}else {
				System.out.println("文件不存在");
			}
			
		}
		System.out.println("判断文件路径是绝对路径还是相对路径"+src.isAbsolute());
	}
	
	public static void test3() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");				//File可表示文件和文件夹
		System.out.println(src.length());									//文件长度
	
	}
	
	public static void test4() throws IOException, InterruptedException {
		System.out.println("######");
		String path= "c:/WeChat Files/1.txt";				//File可表示文件和文件夹
		File src = new File(path);
		if (!src.exists()) {
			boolean flag = src.createNewFile();
			System.out.println(flag?"成功":"失败");
		}else {
		}  
		System.out.println("==删除==");
		boolean flag = src.delete();
		System.out.println(flag?"成功":"失败");
		
		System.out.println("==临时文件==");
		File temp = File.createTempFile("test", "temp", new File("c:/WeChat Files"));
		System.out.println("创建成功");
		Thread.sleep(5000);
		temp.deleteOnExit();  	//退出就删除
		System.out.println("删除成功");
		
	}
}
