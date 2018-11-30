package cn.sxt.TestString;
/**
 * String类不可变字符序列
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
		System.out.println(str3.equals(str));			//比较内容是否相等
		System.out.println(str2==str);
		System.out.println(str3==str);
		
		System.out.println("##########");
		
		String str4 ="abc";
		String str5 = "abc";
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		
		/**替换字符**/
		String str6 = str5.replace('a','*');
		System.out.println(str6);
		//System.out.println(str5);
		
		/**切割数组**/
		String str7 = "abcd,asdw,asdsad";
		String[ ] strArray = str7.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		String str8 = "   aa   bb   ";
		String str77 = str7.trim( );
		System.out.println(str77.length());
		
		/**比较数组不区分大小写true/f**/
		System.out.println("Abc".equalsIgnoreCase("abc"));				
		
		/**遍历从左到右--last从右到左**/
		System.out.println("Abcdb".indexOf('b'));
		System.out.println("Abcdb".lastIndexOf('b'));
		
		/**是否以**开头（区分大小写）**/
		System.out.println("Abcdb".startsWith("ab"));
		
		/**是否以**结尾**/
		System.out.println("Abcdb".endsWith("db"));
		
		/**全部转为小写**/
		System.out.println("Abcdb".toLowerCase());
		
		/**全部转为大写**/
		System.out.println("Abcdb".toUpperCase());
		
		//Note: gh可修改；a不可修改被final修饰 
		String gh = "a";
		for (int i = 0; i < 10; i++) {
			gh +=i;
		}
		System.out.println(gh);				//一共有11个对象
		
		String gi = new String("a");
		for (int i = 0; i < 10; i++) {
			gi += i;
		}
		System.out.println(gi);				//一共有12个对象
		
	}
	
}
