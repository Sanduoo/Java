package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1���ݹ�������Ｖ�ļ�|�ļ���
 * 2���ļ�-ֱ�Ӹ���copyFile ���ļ���-ֱ�Ӵ���mkdirs����
 * @author Administrator
 *
 */
public class CopyDir {
      /**
       * 
       * @param args
       */
	public static void main(String[] args)  {
		String srcPath = "c:/WeChat Files/a";				//ԴĿ¼
		String destPath = "c:/WeChat Files/b";	         //Ŀ��Ŀ¼
        
  		try {
			FileUtil.copyDir(srcPath, destPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void copyDir(String srcPath,String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);		
		copyDir(src, dest);
	}
	
	/**
	 * �����ļ���
	 * @param src	ԴFile����
	 * @param dest Ŀ��File����
	 */
	public static void copyDir(File src,File dest) {

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
	public static void copyDirDetail(File src,File dest) {
		
		if (src.isFile()) {				//�ж�src�Ƿ�Ϊ�ļ�
			try {
				FileUtil.copyFile(src, dest);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if (src.isDirectory()) {
			dest.mkdirs();				//�����ļ���
			//��ȡ��һ��Ŀ¼|�ļ�
			for(File sub:src.listFiles()) {
				copyDirDetail(sub, new File(dest, src.getName()));
			}
		}
	}
	
}
