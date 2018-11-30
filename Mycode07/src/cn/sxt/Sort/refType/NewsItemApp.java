package cn.sxt.Sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.sxt.Sort.innerType.Utils;

/**
 * 使用Collection
 * @author Admin
 *
 */
public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("三多今天洗了衣服，全国欢呼了", 150, new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("三多今天跑了五公里，全国欢呼了", 100, new Date()));
		news.add(new NewsItem("三多今天看了Java，全国欢呼了", 180, new Date(System.currentTimeMillis()-1000*60*60)));
		System.out.println("排序前："+news);
		
		
//	 	排序
//		Collections.sort(news);
		Utils.sort(news);
		System.out.println("排序后"+news);
	}
}
