
/**
 * 强制类型转化常见错误
 * @author Administrator
 *
 */

public class TestTypeConvertError {
	public static void main(String[] args) {
		
		int money = 1000000000;				//10亿
		int years = 20;
		
		int total = money*years;
		System.out.println(total);				//超出int的范围，total为负数
		
		long total1 = money*years;
		System.out.println(total1);				//默认为int，结果先为int （此时数据以丢失），再转成long类型
		
		long total2 = money*((long)years);
		System.out.println(total2);				//将一个因子变成long，此时表达式已经提升，全部用long来计算
		
		
		//Note: 常见问题L和l，l容易与1弄混，一般用L
		int l = 2;
		long a = 123456l;
		System.out.println(l+1);
		
	}
}
