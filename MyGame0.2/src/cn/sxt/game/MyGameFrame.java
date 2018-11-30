package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.omg.PortableServer.POAPackage.WrongAdapter;
import java.awt.image.*;
/**
 * 飞机游戏的主窗口
 * @author Admin
 *
 */
public class MyGameFrame extends JFrame{
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g) {			//自动被调用。g变量相当于一支画笔
		Color c = g.getColor();
		Font f = g.getFont();
		g.setColor(Color.BLUE);
		
		super.paint(g);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 200);
		g.fillRect(100, 100,40, 40);
		g.setColor(Color.RED);
		g.setFont(new Font("宋体", Font.BOLD,50));
		g.drawString("我是谁？", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
		g.setColor(c);
		g.setFont(f);
	}

	
	
	/*初始化窗口*/
	public void launchFrame() {
		this.setTitle("三多");							//窗口标题
		this.setVisible(true);							//窗口可见
		this.setSize(500, 500);						//窗口尺寸
		this.setLocation(300, 300);				//窗口位置
		
		/*窗口关闭结束任务指令*/
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
