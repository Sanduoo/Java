package cn.sxt.game;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 炮弹类
 * @author Admin
 *
 */

public class Shell extends GameObjective {
	
	double degree;					//弧度0-2π之间
	
	
	public Shell(){
		x = 200;
		y = 200;
		width = 10;
		height = 10;
		speed = 3;
		degree = Math.random()*Math.PI*2;
		
		
		
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.yellow);
		
		//Note: 颜色填充矩形外框的椭圆
		g.fillOval((int)x, (int)y, width, height);
		
		/*炮弹沿着任意角度去飞*/
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if (x<0||x>Constant.GAME_WIDTH-width) {
			degree = Math.PI-degree;
			speed = 0;
			speed+=3;
		}
		
		if (y<30||y>Constant.GAME_HEIGHT-height) {
			degree = -degree;
			speed = 0;
			speed+=3;
		}
		
		
	
		g.setColor(c);
	}
	
}

