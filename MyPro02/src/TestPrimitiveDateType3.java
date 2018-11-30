
/**
 * 测试字符类型和布尔类型
 * @author Administrator
 *
 */

public class TestPrimitiveDateType3 {
	public static void main(String[] args) {
		
		char a = 'T';
		char t = '你';
		char c = '\u0061';
		System.out.println(c);
	
		/**转义字符*/
		System.out.println("1"+'a'+'\n'+'b');
		System.out.println("2"+'a'+'\t'+'b');
		System.out.println("3"+'a'+"'"+'b');
		System.out.println("4"+'a'+'\''+'b');
		
		
		//Note: String是字符序列
		String d = "abc";
		
		
		/**测试布尔类型*/
		boolean man = true;
		
		if (man) {			//不推荐man == true
			System.out.println("男性");
			
		}
	}
}
