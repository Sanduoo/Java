package cn.sxt.Sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.sxt.Sort.innerType.Utils;

/**
 * ʹ��Collection
 * @author Admin
 *
 */
public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("�������ϴ���·���ȫ��������", 150, new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("������������幫�ȫ��������", 100, new Date()));
		news.add(new NewsItem("������쿴��Java��ȫ��������", 180, new Date(System.currentTimeMillis()-1000*60*60)));
		System.out.println("����ǰ��"+news);
		
		
//	 	����
//		Collections.sort(news);
		Utils.sort(news);
		System.out.println("�����"+news);
	}
}
