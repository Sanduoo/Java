package cn.sxt.Sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻条目实体类
 * @author Admin
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem>{
	
	private String title;				//标题
	private int hit;						//点击量
	private Date pubTime;			//时间
	
	//	无参构造器快捷键Ctrl+/
	public NewsItem() {
	}
	public NewsItem(String title, int hit, Date pubTime) {
		super();
		this.title = title;
		this.hit = hit;
		this.pubTime = pubTime;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
//	排序规则：时间降序+点击量升序+标题降序
	@Override
	public int compareTo(NewsItem o) {
		int result = 0;
//		比较时间
		result = -this.pubTime.compareTo(o.pubTime);
		if (0==result) {				//时间相同
//			比较点击量
			result = this.hit-o.hit;
			if (0==result) {
//				比较标题
				result = -this.title.compareTo(o.title);
			} 
			
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("标题：").append(this.title);
		sb.append("，时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("，点击量：").append(this.hit).append("\n");
		return sb.toString();
	}
	
	
}
