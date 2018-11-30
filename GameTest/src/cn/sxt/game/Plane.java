package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObjective{
	
	
	boolean left,right,up,down;
	boolean live = true;
	
	public void drawSelf(Graphics g) {
		
		if (live) {
			g.drawImage(img, (int)x,(int) y, null);

			if (left) {
				x-=speed;										//x=x-speed
			}
			if (right) {
				x+=speed;
			}
			if (up) {
				y-=speed;
			}
			if (down) {
				y+=speed;
			}
		}else {
			
			
		}
		
		
	}
	
	//���幹����
	public Plane(Image img,double x,double y) {	
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = 10;
		this.width = 6;
		this.height = 6;
	}
	
	/*����ĳ����,������Ӧ�ķ���*/
	public void addDriection(KeyEvent e) {

		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right= true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
			}
		}
		
		/*̧��ĳ������ȡ����Ӧ�ķ���*/
		public void minusDriection(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left = false;
				break;
			case KeyEvent.VK_UP:
				up = false;
				break;
			case KeyEvent.VK_RIGHT:
				right= false;
				break;
			case KeyEvent.VK_DOWN:
				down = false;
				break;
			}
		}
}