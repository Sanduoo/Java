package cn.sanduo;

import java.util.Arrays;

/**
 * 二分法查找
 * @author Admin
 *
 */
public class DichotomySearch {
	public static void main(String[] args) {
		
//		System.out.println(args[1]);
		
		int [] array = {213,456,7987,464,1631,4646,8974,};
		int searchWord = 4646;			//所要查找的数
		int seachCount = 0;				//count计数器：记录查找时循环次数
		
		System.out.printf("普通循环查找%d的次数是%d",searchWord,genetallLoop(array,searchWord));
		System.out.printf("二分法查找%d的次数是%d",searchWord,binarySearch(array,searchWord));
	}
	
	/**普通的循环法查找（最少一次，最多七次）**/
	static int genetallLoop(int[] array,int searchWord){
		
		int searchCount = 0;
		
		for (int i = 0; i < array.length; i++) {
			searchCount++;
			if (searchWord==array[i]) {
				break;
			}
		}
		return searchCount;
	}
	
	/**二分法查找（最少一次，最多三次）**/
	static int binarySearch(int[] array,int searchWord) {
		
		/**sort排序**/
		Arrays.sort(array);				//对先传进来的数进行排序
		System.out.println("\n"+Arrays.toString(array));
		
		/**二分法查找**/
		int ilndex = 0;					//相当于指针的东西
		int iStart = 0;
		int iEnd = array.length-1;
		int searchCount = 0;
		
		for (int i = 0; i < array.length/2; i++) {
			searchCount++;
			ilndex = (iStart+iEnd)/2;					//比较中间数
			if (array[ilndex]<searchWord) {
				System.out.println("aa");
				iStart = ilndex;
			}else if (array[ilndex]>searchWord) {
				System.out.println("bb");
				iEnd = ilndex;
			}else {
				break;
			}
		}
		return searchCount;
	}
}
