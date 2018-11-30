package cn.sxt.game;

import java.awt.Color;
import java.awt.Graphics;

public class Shell2 extends Shell{
	
	//boolean division = false;
	

	public void draw2(Graphics g) {
		
		
		if (x<0||x>Constant.GAME_WIDTH-width) {
			//division = true;
			degree = 2*Math.PI-degree;
			speed = 0;
			speed+=3;
		}
		
		if (y<30||y>Constant.GAME_HEIGHT-height) {
			//division = true;
			degree = 2*Math.PI-degree;
			speed = 0;
			speed+=3;
		}

	}
	
}
