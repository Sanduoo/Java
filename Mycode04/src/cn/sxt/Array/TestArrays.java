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
	*			Arrays.toString��Object���е�toString�Ĺ�ϵ��
	*Note��Object ��� toString ��������һ���ַ��������ַ����������������Ǹ����һ��ʵ������
	*			at ��Ƿ���@���ʹ˶����ϣ����޷���ʮ�����Ʊ�ʾ��ɡ�
	*			Arrays��toString�����Ƿ���ָ���������ݵ��ַ�����ʾ��ʽ��
	*			����������������ϵ��û�и�д��
	*/
	System.out.println(Arrays.toString(a));				//�������������
	System.out.println("��Ԫ�ص�������"+Arrays.binarySearch(a, 23));	 			//���ַ�����
	
	Arrays.fill(a, 2,4,100); 				//��䣺��2��4������Ԫ���滻Ϊ100
	
	/**
	 * Note: ��ӡ��������ַ���
	   �ٴ�ͳ��forѭ����ʽ��
		   for(int i=0;i<array.length;i++){
		   		System.out.println(a[i]);
	       }
       
       ��for eachѭ����
		  for(int a:array)
		      System.out.println(a);
		      
		������Array���е�toString������������һ����������Ԫ�ص��ַ�����
			int[] array = {1,2,3,4,5};
				System.out.println(Arrays.toString(array));
				
		˵����System.out.println(array);�����ǲ��еģ�������ӡ�ǵ���������׵�ַ��
	 */
	System.out.println(Arrays.toString(a));
	}
}
