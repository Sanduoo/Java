package cn.sxt.Enumeration;
import java.util.StringTokenizer;
/**
 * Enumeration子类StringTokemizer：String split() 字符串的分割
 * 不支持正则表达式
 * @author Admin
 *
 */
public class StringTokemizer {
	public StringTokemizer(String emailStr, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String emailStr = "baidu.com;google.com;sine.com";
		StringTokemizer tokemizer = new StringTokemizer(emailStr,";");
/*		
		while (tokemizer.hasMoreElements()) {
			System.out.println(tokemizer.nextElement());
		}
*/		
	}
}


//163