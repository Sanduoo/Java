package cn.sxt.stringbuilder;
/**
 * ���Կɱ��ַ����У�StringBuilder(�̲߳���ȫЧ�ʸ�),StringBuffer(�̰߳�ȫЧ�ʵ�)��
 * @author Admin
 *
 */
public class Test01  {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();				//�ַ����鳤�ȳ�ʼΪ16
		StringBuilder sb1 = new StringBuilder(32);				//�ַ����鳤�ȳ�ʼΪ32
		StringBuilder sb2 = new StringBuilder("abcd");				//�ַ����鳤�ȳ�ʼΪ23��value[ ]={'a','b','c','d',/u0000,/u0000...}
		sb2.append("efg");														//�ַ����鳤�ȳ�ʼΪ22��value[ ] = {'a','b','c','d','e','f','g',/u0000,/u0000...}

		sb2.append(true).append(321).append("���");				//ͨ��return this ʵ�ַ����� 
			
		System.out.println(sb2);				//abcdefgtrue
		
		StringBuilder gh = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			gh.append(i);
		}
		System.out.println(gh);
	}
}
