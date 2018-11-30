package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.omg.PortableServer.POAPackage.WrongAdapter;
import java.awt.image.*;
import java.util.Date;
/**
 * 飞机游戏的主窗口
 * @author Admin
 *
 */
public class MyGameFrame extends JFrame{
	
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane =  new Plane(planeImg,250,250);
	Shell shell = new Shell(); 
	Shell[] shells = new Shell[20];
	
	Shell2 shell2 = new Shell2();
	Shell2[] shells2 = new Shell2[600];
	
	Explode boom;
	
	Date startTime = new Date();
	Date endTime;
	int period;											//游戏持续时间
	
	@Override
	public void paint(Graphics g) {			//自动被调用。g变量相当于一支画笔
		Color c = g.getColor();
 		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);							//画飞机
		
		/*画出所有炮弹*/ 
		
		for (int i = 0; i <shells.length; i++) {
			shells[i].draw(g); 
			
			/**for (int j = 0; j <shells.length; j++) {
				shells2[j].draw2(g);
			}**/
			
			/*碰撞检测*/
			boolean peng = shells[i].getRect().intersects(plane.getRect());

			if (peng) {
				plane.live = false;
				if (boom == null) {
					boom = new Explode(plane.x, plane.y);
					
					endTime = new Date();
					period = (int)((endTime.getTime()-startTime.getTime())/1000);
				}
				
				boom.draw(g);
			}
			/*计时功能，给出提示*/
			if (!plane.live) {
				
				g.setColor(Color.white);
				Font f = new Font("宋体", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("时间："+period+"秒", 120,250);
			}
		}
	
		g.setColor(c);

	}

	/*定义一个内部类（方便调用外部类的方法属性）*/
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				
				//System.out.println("窗口重画一次！");
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
	
	/*定义键盘监听内部类*/
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			/*e.getKeyCode();			获取按下的键*/
			//System.out.println("按下："+e.getKeyCode());
			plane.addDriection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			/*e.getKeyCode();*/
			//System.out.println("抬起："+e.getKeyCode());
			plane.minusDriection(e);
		}
		
	}
	
	/*初始化窗口*/
	public void launchFrame() {
		this.setTitle("飞机小游戏");				//窗口标题
		this.setVisible(true);							//窗口可见
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);						//窗口尺寸
		this.setLocation(300, 300);				//窗口位置
		
		/*窗口关闭结束任务指令*/
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		new PaintThread().start();				//启动重画窗口的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘的监听

		/*初始化30个炮弹*/
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
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
