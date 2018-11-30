package cn.sxt.game;

/**
 *游戏物体的父类
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

	/*构造器方便以后调用*/
	public GameObjective(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	/*构造器方便以后调用*/
	public GameObjective(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	/*空（无参）构造器*/
	public GameObjective() {
	}
	
	/*返回物体所在的矩形，便于后续的碰撞检测*/
	public Rectangle getRect() {
		return new Rectangle((int)x, (int)y, width, height);			//x,y定义是为double类型，此处需要int类型，所以强制转换
	}
	
}
