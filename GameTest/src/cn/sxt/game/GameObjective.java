package cn.sxt.game;

/**
 *��Ϸ����ĸ���
 * @author Admin
 *
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class GameObjective {
	Image img;
	double x,y;
	int speed;
	int width,height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x,(int) y, null);
	}

	/*�����������Ժ����*/
	public GameObjective(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	/*�����������Ժ����*/
	public GameObjective(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	/*�գ��޲Σ�������*/
	public GameObjective() {
	}
	
	/*�����������ڵľ��Σ����ں�������ײ���*/
	public Rectangle getRect() {
		return new Rectangle((int)x, (int)y, width, height);			//x,y������Ϊdouble���ͣ��˴���Ҫint���ͣ�����ǿ��ת��
	}
	
}
