package cn.sxt.Sort.innerType;



/**
 * 内置引用数据类型的比较：comparTo（）
 * 整数、小数integer float double 直接比较基本数据类型大小
 * 字符：比较的Unicode码之差
 * 字符串：
 * 		1.如果其中一个是另外一个起始开始的子串，返回长度之差
 * 		2.否则返回第一个不相等的Unicode码之差
 * 
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Integer a;				//根据基本数据类型大小
		Character ch;		//根据Unicode编码顺序
		String str ="abc";
		String str2 = "abcd";
		System.out.println(str.compareTo(str2)); 			//字符串：长度不同比长度
		str2 = "abe";
		System.out.println(str.compareTo(str2)); 			//字符串：长度相同，返回第一个不相等的Unicode码之差
		
		java.util.Date date;				//根据日期的长整型数来比较：D1<D2 -1;D1==D2 0；D1>D2 1
		
	}
}
