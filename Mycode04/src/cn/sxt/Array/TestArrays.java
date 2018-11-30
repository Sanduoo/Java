package cn.sxt.Array;

import java.util.Arrays;
/**
 * 
 * @author Admin
 *
 */
public class TestArrays {
public static void main(String[] args) {
	

	int [ ] a= {1,2,323,23,546,132,31};
	Arrays.sort(a);
	
	
	/**
	*			Arrays.toString和Object类中的toString的关系？
	*Note：Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、
	*			at 标记符“@”和此对象哈希码的无符号十六进制表示组成。
	*			Arrays的toString方法是返回指定数组内容的字符串表示形式。
	*			两者是重名函数关系，没有复写。
	*/
	System.out.println(Arrays.toString(a));				//对数组进行排序
	System.out.println("该元素的索引："+Arrays.binarySearch(a, 23));	 			//二分法查找
	
	Arrays.fill(a, 2,4,100); 				//填充：将2到4索引的元素替换为100
	
	/**
	 * Note: 打印数组的三种方法
	   ①传统的for循环方式：
		   for(int i=0;i<array.length;i++){
		   		System.out.println(a[i]);
	       }
       
       ②for each循环：
		  for(int a:array)
		      System.out.println(a);
		      
		③利用Array类中的toString方法：（返回一个包含数组元素的字符串）
			int[] array = {1,2,3,4,5};
				System.out.println(Arrays.toString(array));
				
		说明：System.out.println(array);这样是不行的，这样打印是的是数组的首地址。
	 */
	System.out.println(Arrays.toString(a));
	}
}
