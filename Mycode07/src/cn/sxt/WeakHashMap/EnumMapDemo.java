package cn.sxt.WeakHashMap;

import java.util.EnumMap;

/**
 * EnumMap要求键为枚举
 * @author Admin
 *
 */
public class EnumMapDemo {

	public static void main(String[] args) {
		EnumMap<Season, String> map = new EnumMap<>(Season.class);
//		存放值
		map.put(Season.SPRING, "春天");
		map.put(Season.SUNMER, "夏天");
		map.put(Season.AUTUMN, "秋天");
		map.put(Season.WINTER, "冬天");
		System.out.println(map.size());
	}

}
enum Season{
	SPRING,SUNMER,AUTUMN,WINTER
}
