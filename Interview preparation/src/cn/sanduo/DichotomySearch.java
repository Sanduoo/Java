package cn.sanduo;

import java.util.Arrays;

/**
 * ���ַ�����
 * @author Admin
 *
 */
public class DichotomySearch {
	public static void main(String[] args) {
		
//		System.out.println(args[1]);
		
		int [] array = {213,456,7987,464,1631,4646,8974,};
		int searchWord = 4646;			//��Ҫ���ҵ���
		int seachCount = 0;				//count����������¼����ʱѭ������
		
		System.out.printf("��ͨѭ������%d�Ĵ�����%d",searchWord,genetallLoop(array,searchWord));
		System.out.printf("���ַ�����%d�Ĵ�����%d",searchWord,binarySearch(array,searchWord));
	}
	
	/**��ͨ��ѭ�������ң�����һ�Σ�����ߴΣ�**/
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
	
	/**���ַ����ң�����һ�Σ�������Σ�**/
	static int binarySearch(int[] array,int searchWord) {
		
		/**sort����**/
		Arrays.sort(array);				//���ȴ�����������������
		System.out.println("\n"+Arrays.toString(array));
		
		/**���ַ�����**/
		int ilndex = 0;					//�൱��ָ��Ķ���
		int iStart = 0;
		int iEnd = array.length-1;
		int searchCount = 0;
		
		for (int i = 0; i < array.length/2; i++) {
			searchCount++;
			ilndex = (iStart+iEnd)/2;					//�Ƚ��м���
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
