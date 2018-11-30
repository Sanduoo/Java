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
	
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	int  planex = 250,planey = 250;
	
	@Override
	public void paint(Graphics g) {			//自动被调用。g变量相当于一支画笔
		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planex, planey, null);
		planex++;													//飞机可以移动
	}

	/*定义一个内部类（方便调用外部类的方法属性）*/
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				System.out.println("窗口重画一次！");
				repaint();							//重画窗口
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 			
			}
		}
	}
	
	
	/*初始化窗口*/
	public void launchFrame() {
		this.setTitle("飞机小游戏");				//窗口标题
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

		
		new PaintThread().start();				//启动重画窗口的线程
		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
	
	//双缓冲技术，先加载到内存再加载到界面
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
}
