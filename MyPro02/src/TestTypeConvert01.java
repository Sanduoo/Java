
/**
 * 强制类型转化
 * @author Administrator
 *
 */

public class TestTypeConvert01 {
	public static void main(String[] args) {
		
		double x = 3.14;
		int nx = (int) x;				//double有小数，int没小数
		char c = 'a';				
		int d = c+1;					//a是97
		
		System.out.println(nx);
		System.out.println(d);
		System.out.println((char)d);
		
	}
}
