package cn.sxt.Sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ������Ŀʵ����
 * @author Admin
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem>{
	
	private String title;				//����
	private int hit;						//�����
	private Date pubTime;			//ʱ��
	
	//	�޲ι�������ݼ�Ctrl+/
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
	
//	�������ʱ�併��+���������+���⽵��
	@Override
	public int compareTo(NewsItem o) {
		int result = 0;
//		�Ƚ�ʱ��
		result = -this.pubTime.compareTo(o.pubTime);
		if (0==result) {				//ʱ����ͬ
//			�Ƚϵ����
			result = this.hit-o.hit;
			if (0==result) {
//				�Ƚϱ���
				result = -this.title.compareTo(o.title);
			} 
			
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("���⣺").append(this.title);
		sb.append("��ʱ�䣺").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("���������").append(this.hit).append("\n");
		return sb.toString();
	}
	
	
}
