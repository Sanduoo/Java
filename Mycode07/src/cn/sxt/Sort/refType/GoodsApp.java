package cn.sxt.Sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<>();
		list.add(new Goods("С����Ƶ",100,2000));
		list.add(new Goods("������Ƶ",200,3000));
		list.add(new Goods("��ʯ��Ƶ",300,2500));
		System.out.println("����ǰ��"+list);
		Collections.sort(list, new GoodsPriceComp());
		System.out.println("�����"+list);
		
		//159
	}
}
