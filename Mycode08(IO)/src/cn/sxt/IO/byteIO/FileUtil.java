package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *1�� �ļ�����
 *2���ļ��п���
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
	 * �����ļ���
	 * @param src	ԴFile����
	 * @param dest Ŀ��File����
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void copyDir(File src,File dest) throws FileNotFoundException, IOException {

		if (src.isDirectory()) {				//�ж��Ƿ�Ϊ�ļ���
			dest= new File(dest,src.getName());				//�����ļ��ж���
		}else if (src.isFile()) {
			copyDirDetail(src,dest);
		}
	}
	
	/**
	 * �����ļ���ϸ��
	 * @param src
	 * @param dest
	 */
	public static void copyDirDetail(File src,File dest) throws FileNotFoundException,IOException{
		
		if (src.isFile()) {				//�ж�src�Ƿ�Ϊ�ļ�
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
			dest.mkdirs();				//�����ļ���
			//��ȡ��һ��Ŀ¼|�ļ�
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
			System.out.println("ֻ�ܿ����ļ�");
			throw new IOException("ֻ�ܿ����ļ�");
		}
		
		//1��������ϵ
//		src = new File("c:/WeChat Files/test.txt");				//�ļ��������
//		dest = new File("c:/WeChat Files/test2.txt");
		
		//2��ѡ����
		InputStream iStream = new FileInputStream(src);
		OutputStream oStream = new FileOutputStream(dest);
		
		//3������
		byte[] flush = new byte[1024];
		int len = -1;
		while (-1!=(len=iStream.read(flush))) {				//��ȡ
			oStream.write(flush, 0, len);
		}
		oStream.flush();
		
		//4���ͷ���Դ-�ر������ȿ���أ�
		iStream.close();
		oStream.close();
	}
}
