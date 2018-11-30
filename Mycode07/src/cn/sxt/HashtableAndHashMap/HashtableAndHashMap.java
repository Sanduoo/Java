package cn.sxt.HashtableAndHashMap;

/**
 * һ��Hashtable��HashMap������
 * 1����Ҫ��Hashtable�̰߳�ȫ��ͬ����Ч����Ե���
 * 				   HashMap�̲߳���ȫ����ͬ����Ч����Խϸ�
 *2�����ࣺHashtable��Dictionary��HashMap��Abstract
 *3��null��Hashtable����ֵ����Ϊ��
 *				 HashMap�����һ��null��ֵ���Զ��null
 * 
 * ����Hashtable����Properties
 * 1�����ã���д��Դ�����ļ�
 * 2������ֵֻ��Ϊ�ַ���
 * 3��������
 * 		Object	 setProperty(String key, String value) 		����Hashtable����put �� 
 * 		String  	 getProperty(String key) 		ʹ�ô������б���ָ���ļ��������ԡ� �������ڷ��ؿգ�
 * 		String	 getProperty(String key, String defaultValue) 	ʹ�ô������б���ָ���ļ��������ԡ��������ڷ���Ĭ��ֵ��
 * 
 * ---�洢---
 *  ��׺properties
 * 		void		 store(OutputStream out, String comments) 		���������б�����Ԫ�ضԣ�д��� Properties���У�
 * 																								���ʺ���ʹ�� load(InputStream)�������ص� Properties���еĸ�ʽ�������  
		void 		store(Writer writer, String comments) 		���������б�����Ԫ�ضԣ�д��� Properties���У�
																						���ʺ�ʹ�� load(Reader)�����ĸ�ʽ���������ַ����� 
 * ��׺XML
 *	   void 		storeToXML(OutputStream os, String comment) 		������ʾ�˱��а������������Ե�XML�ĵ��� ��UTF-8��
 *		void 		storeToXML(OutputStream os, String comment, String encoding) 	ʹ��ָ���ı��뷢����ʾ�˱��а������������Ե�XML�ĵ���
 * 
 * ---��ȡ---
 * 		void load(InputStream inStream) �������ֽ�����ȡ�����б�����Ԫ�ضԣ��� 
 * 		void load(Reader reader) �Լ򵥵����Ը�ʽ�������ַ�����ȡ�����б��ؼ��ֺ�Ԫ�ضԣ���
 *  
 * 		void loadFromXML(InputStream in) ��ָ���������е�XML�ĵ���ʾ���������Լ��ص������Ա��С� 
 * @author Admin
 * 
 *
 */
public class HashtableAndHashMap {

}
