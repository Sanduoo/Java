package cn.sxt.IO.File;

/**
 * ���÷���
 * 1���ļ���
 * getName(���ļ�����·����
 * getpath()	·����
 * getAbsoluteFile()	����·������Ӧ��File����
 * getAbsolutePath()	����·����
 * getParent()	��Ŀ¼�����·���ĸ�Ŀ¼������Ϊ�գ��磺ɾ�������Ľ��
 * 2���ж���Ϣ
	exists()		�ж��Ƿ����
	canWrite()
	canRead()
	isFile()
	isDirectory()
	isAbsolute()������ƽ̨���죬ie���̷���ͷ��������/��ͷ
	3������ �ֽ���  ���ܶ�ȡ�ļ��еĳ���
	length()
	4��������ɾ��
	createNewFile() �����ڴ������ļ�,���ڷ���false
	delete() ɾ���ļ�
	static createTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp) Ĭ����ʱ�ռ�
	staticcreateTempFile(ǰ׺3���ֽڳ�����׺Ĭ��.temp,Ŀ¼)
	deleteOnExit() �˳������ɾ��,������ɾ����ʱ�ļ�
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
			System.out.println("�ļ�����ʧ��");
		}
	}
	public static void test1() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");
		System.out.println(src.getName());						//��������
		System.out.println(src.getPath());						//����Ǿ���·������������·�����������·��
		System.out.println(src.getAbsolutePath());			//���ؾ���·����������·���� 167-01:57
		System.out.println(src.getParent()); 					//������һ��Ŀ¼���������Եģ�����null
	}
	
	public static void test2() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");				//File�ɱ�ʾ�ļ����ļ���
		System.out.println("�ļ��Ƿ����"+src.exists());
		System.out.println("�ж��Ƿ��д"+src.canWrite());
		System.out.println("�ж��Ƿ�ɶ�"+src.canRead());
		System.out.println("�ж��Ƿ�Ϊ�ļ�"+src.isFile());
		System.out.println("�ж��Ƿ�Ϊ�ļ���"+src.isDirectory());			//����ļ������ڣ���Ĭ���ļ���
		if (src.isFile()) {
			System.out.println("�ļ�");
		}else {
			if (src.isDirectory()) {
				System.out.println("�ļ���");
			}else {
				System.out.println("�ļ�������");
			}
			
		}
		System.out.println("�ж��ļ�·���Ǿ���·���������·��"+src.isAbsolute());
	}
	
	public static void test3() {
		System.out.println("######");
		File src = new File("c:/WeChat Files/1.txt");				//File�ɱ�ʾ�ļ����ļ���
		System.out.println(src.length());									//�ļ�����
	
	}
	
	public static void test4() throws IOException, InterruptedException {
		System.out.println("######");
		String path= "c:/WeChat Files/1.txt";				//File�ɱ�ʾ�ļ����ļ���
		File src = new File(path);
		if (!src.exists()) {
			boolean flag = src.createNewFile();
			System.out.println(flag?"�ɹ�":"ʧ��");
		}else {
		}  
		System.out.println("==ɾ��==");
		boolean flag = src.delete();
		System.out.println(flag?"�ɹ�":"ʧ��");
		
		System.out.println("==��ʱ�ļ�==");
		File temp = File.createTempFile("test", "temp", new File("c:/WeChat Files"));
		System.out.println("�����ɹ�");
		Thread.sleep(5000);
		temp.deleteOnExit();  	//�˳���ɾ��
		System.out.println("ɾ���ɹ�");
		
	}
}
