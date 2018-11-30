package cn.sxt.HashMap;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food?
 * ͳ��ÿ�����ʳ��ֵĴ���
 * �洢��Map��
 * key��String
 * value���Զ�������
 * 
 * ���ּ�˼·
 * 1��Ϊ���е�key������������Ŷ�Ӧ��value
 * 2����һ�δ������������ֵvalue���ڶ��Σ�ֱ��ʹ���������ֵ
 * 
 * @author Admin
 *
 */
public class Demo01 {
	
	
	public static void main(String[] args) {
		String string="this is a cat and that is a mice and where is the food";
		/*�ָ��ַ���*/
		String[ ] strArray = string.split(" ");
		/*���浽Map��*/
		Map<String, Letter> letters = new HashMap<String,Letter>();
		
		//˼·��
		for (String temp : strArray) {				//�������
			
			Letter coLetter = null;
			//1��Ϊ��ǰkey��������
			if (null==(coLetter=letters.get(temp))) {				//��������ڸ�key���������򴴽�һ������
				coLetter.setCount(1);
				letters.put(temp, coLetter);
			}else {
				//�ڶ��Σ�ֱ��ʹ���������ֵ
				coLetter.setCount(coLetter.getCount()+1);				//����һ��key��count+1
			}
		}
		
		//���Map��ֵ
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter coLetter = letters.get(key);
			System.out.println("��ĸ��"+key+"������"+coLetter.getCount());
		}
		
	}
/**	
	public static void test1() {

		//*˼·һ
		for (String temp : strArray) {				//�������
			
			//1��Ϊ����key��������
			if (!letters.containsKey(temp)) {				//��������ڸ�key���������򴴽�һ������
				letters.put(temp, key);
			}
			//�ڶ��Σ�ֱ��ʹ���������ֵ
			Letter coLetter = letters.get(temp);							//ֱ��ʹ������
			coLetter.setCount(coLetter.getCount()+1);				//����һ��key��count+1
		}
		
		//���Map��ֵ
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter coLetter = letters.get(key);
			System.out.println("��ĸ��"+key+"������"+coLetter.getCount());
		}
	}
	
**/
	
	
}
