package cn.sxt.Sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<>();
		list.add(new Goods("小李视频",100,2000));
		list.add(new Goods("老李视频",200,3000));
		list.add(new Goods("老石视频",300,2500));
		System.out.println("排序前："+list);
		Collections.sort(list, new GoodsPriceComp());
		System.out.println("排序后："+list);
		
		//159
	}
}
