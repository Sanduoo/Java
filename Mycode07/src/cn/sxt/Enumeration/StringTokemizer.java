package cn.sxt.Enumeration;
import java.util.StringTokenizer;
/**
 * Enumeration����StringTokemizer��String split() �ַ����ķָ�
 * ��֧��������ʽ
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