package cn.sxt.Fanxing;

/**
 * 获取值
 * 1.需要强制类型转换 
 * 2.手动类型检查：避免转换错误  java.lang.ClassCastException
 * @author Admin
 *
 */
public class App {
	public static void main(String[] args) {
		
		//Note: Object-->Integer-->自动装箱
		Object object = 80;
		int score = (int)object;
		System.out.println(score);
		
		//Note: 存入整数 int-->Integer-->Object
		Student student = new Student(80, 90);
/*		student.getJavase();*/
		
		int javaseScore = (Integer)student.getJavase();
		String oracleScore = null;
		if (student.getOracle() instanceof String) {
			oracleScore = (String)student.getOracle();
		}
		System.out.println("分数为："+javaseScore+","+oracleScore);
	}
}
