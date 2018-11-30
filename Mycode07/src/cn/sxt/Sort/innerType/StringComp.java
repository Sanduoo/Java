package cn.sxt.Sort.innerType;

/**
 * 排序规则的业务类
 * @author Admin
 *
 */
public class StringComp implements java.util.Comparator<String>{
	
	/*按长度大小比较（正数、负数、零）*/
	public int  compare(String o1,String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		return len1-len2;
	}
}
