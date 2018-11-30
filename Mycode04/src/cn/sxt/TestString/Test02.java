package cn.sxt.TestString;
/**
 * 测试StringBuilder的常用方法
 * @author Admin
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstvuwxyz");
		
		/**删除第三和第五个字符**/
		sb.delete(3,5).delete(3, 5);
		System.out.println(sb);
		
		/**反转**/
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
	}
}
