package cn.sxt.Sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1、binarySearch(List<? extends Comparable<? super T>> list, T key)		使用二叉搜索算法搜索指定对象的指定列表。
 * 要求：list容器有序
 * 
 * 2、sort(List<T> list) 根据其元素的natural ordering		对指定的列表进行排序。
 * 		sort(List<T> list, Comparator<? super T> c) 		根据指定的比较器引起的顺序对指定的列表进行排序
 * 
 * 3、reverse(List<?> list) 		反转指定列表中元素的顺序。
 * 		shuffle(List<?> list) 		使用默认的随机源随机排列指定的列表。（打乱顺序）
 * 
 * 4、swap(List<?> list, int i, int j) 		交换指定列表中指定位置的元素
 * 
 * @author Admin
 *
 */
public class CollectionsDome01 {
	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		//shuffle 洗牌 模拟斗地主 
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
//		洗牌
		Collections.shuffle(cards);
//		依次发牌
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		List<Integer> last = new ArrayList<>();				//留三张底牌
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
//			last.add(cards.get(i+3));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));

		System.out.println("第一个人："+p1);
		System.out.println("第二个人："+p2);
		System.out.println("第三个人："+p3);
		System.out.println("底牌为："+last);
	}
	
//	反转
	public static void test1() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("反转之后的list"+list);
	}
}


//161