package cn.sxt.TestString;
/**
 * String�಻�ɱ��ַ�����
 * @author Admin
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str = new String("abcd");
		String str2 = str;
		String str3 = new String("abcd");
		
		/****/
		System.out.println(str.charAt(2));
		System.out.println(str2.equals(str));
		System.out.println(str3.equals(str));			//�Ƚ������Ƿ����
		System.out.println(str2==str);
		System.out.println(str3==str);
		
		System.out.println("##########");
		
		String str4 ="abc";
		String str5 = "abc";
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		
		/**�滻�ַ�**/
		String str6 = str5.replace('a','*');
		System.out.println(str6);
		//System.out.println(str5);
		
		/**�и�����**/
		String str7 = "abcd,asdw,asdsad";
		String[ ] strArray = str7.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		String str8 = "   aa   bb   ";
		String str77 = str7.trim( );
		System.out.println(str77.length());
		
		/**�Ƚ����鲻���ִ�Сдtrue/f**/
		System.out.println("Abc".equalsIgnoreCase("abc"));				
		
		/**����������--last���ҵ���**/
		System.out.println("Abcdb".indexOf('b'));
		System.out.println("Abcdb".lastIndexOf('b'));
		
		/**�Ƿ���**��ͷ�����ִ�Сд��**/
		System.out.println("Abcdb".startsWith("ab"));
		
		/**�Ƿ���**��β**/
		System.out.println("Abcdb".endsWith("db"));
		
		/**ȫ��תΪСд**/
		System.out.println("Abcdb".toLowerCase());
		
		/**ȫ��תΪ��д**/
		System.out.println("Abcdb".toUpperCase());
		
		//Note: gh���޸ģ�a�����޸ı�final���� 
		String gh = "a";
		for (int i = 0; i < 10; i++) {
			gh +=i;
		}
		System.out.println(gh);				//һ����11������
		
		String gi = new String("a");
		for (int i = 0; i < 10; i++) {
			gi += i;
		}
		System.out.println(gi);				//һ����12������
		
	}
	
}
