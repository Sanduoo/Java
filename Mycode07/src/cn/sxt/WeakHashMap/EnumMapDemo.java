package cn.sxt.WeakHashMap;

import java.util.EnumMap;

/**
 * EnumMapҪ���Ϊö��
 * @author Admin
 *
 */
public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Season, String> map = new EnumMap<>(Season.class);
//		���ֵ
		map.put(Season.SPRING, "����");
		map.put(Season.SUNMER, "����");
		map.put(Season.AUTUMN, "����");
		map.put(Season.WINTER, "����");
		System.out.println(map.size());
	}

}
enum Season{
	SPRING,SUNMER,AUTUMN,WINTER
}
