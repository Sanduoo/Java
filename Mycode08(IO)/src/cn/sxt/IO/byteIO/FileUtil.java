package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *1、 文件拷贝
 *2、文件夹拷贝
 * @author Administrator
 *172
 */
public class FileUtil {
	

	public static void copyDir(String srcPath,String destPath) throws FileNotFoundException, IOException {
		File src = new File(srcPath);
		File dest = new File(destPath);		
		copyDir(src, dest);
	}
	
	/**
	 * 拷贝文件夹
	 * @param src	源File对象
	 * @param dest 目标File对象
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void copyDir(File src,File dest) throws FileNotFoundException, IOException {

		if (src.isDirectory()) {				//判断是否为文件夹
			dest= new File(dest,src.getName());				//构建文件夹对象
		}else if (src.isFile()) {
			copyDirDetail(src,dest);
		}
	}
	
	/**
	 * 拷贝文件夹细节
	 * @param src
	 * @param dest
	 */
	public static void copyDirDetail(File src,File dest) throws FileNotFoundException,IOException{
		
		if (src.isFile()) {				//判断src是否为文件
			try {
				FileUtil.copyFile(src, dest);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				throw e;
			} catch (IOException e) {
				e.printStackTrace();
				throw e;
			}
		}else if (src.isDirectory()) {
			dest.mkdirs();				//构建文件夹
			//获取下一级目录|文件
			for(File sub:src.listFiles()) {
				copyDirDetail(sub, new File(dest, src.getName()));
			}
		}
	}

	public static void copyFile(String srcPath,String destPath) throws IOException {
		
//		File src = new File(srcPath);
//		File dest= new File(destPath);
		
		copyFile(new File(srcPath),new File(destPath));
	}
	public static void copyFile(File src,File dest) throws IOException {
		
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		
		//1、建立联系
//		src = new File("c:/WeChat Files/test.txt");				//文件必须存在
//		dest = new File("c:/WeChat Files/test2.txt");
		
		//2、选择流
		InputStream iStream = new FileInputStream(src);
		OutputStream oStream = new FileOutputStream(dest);
		
		//3、拷贝
		byte[] flush = new byte[1024];
		int len = -1;
		while (-1!=(len=iStream.read(flush))) {				//读取
			oStream.write(flush, 0, len);
		}
		oStream.flush();
		
		//4、释放资源-关闭流（先开后关）
		iStream.close();
		oStream.close();
	}
}
