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
 * �ɻ���Ϸ��������
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
	int period;											//��Ϸ����ʱ��
	
	@Override
	public void paint(Graphics g) {			//�Զ������á�g�����൱��һ֧����
		Color c = g.getColor();
 		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);							//���ɻ�
		
		/*���������ڵ�*/ 
		
		for (int i = 0; i <shells.length; i++) {
			shells[i].draw(g); 
			
			/**for (int j = 0; j <shells.length; j++) {
				shells2[j].draw2(g);
			}**/
			
			/*��ײ���*/
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
			/*��ʱ���ܣ�������ʾ*/
			if (!plane.live) {
				
				g.setColor(Color.white);
				Font f = new Font("����", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("ʱ�䣺"+period+"��", 120,250);
			}
		}
	
		g.setColor(c);

	}

	/*����һ���ڲ��ࣨ��������ⲿ��ķ������ԣ�*/
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				
				//System.out.println("�����ػ�һ�Σ�");
				repaint();							//�ػ�����
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 			
			}
		}
	}
	
	/*������̼����ڲ���*/
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			/*e.getKeyCode();			��ȡ���µļ�*/
			//System.out.println("���£�"+e.getKeyCode());
			plane.addDriection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			/*e.getKeyCode();*/
			//System.out.println("̧��"+e.getKeyCode());
			plane.minusDriection(e);
		}
		
	}
	
	/*��ʼ������*/
	public void launchFrame() {
		this.setTitle("�ɻ�С��Ϸ");				//���ڱ���
		this.setVisible(true);							//���ڿɼ�
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);						//���ڳߴ�
		this.setLocation(300, 300);				//����λ��
		
		/*���ڹرս�������ָ��*/
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		new PaintThread().start();				//�����ػ����ڵ��߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̵ļ���

		/*��ʼ��30���ڵ�*/
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
		}
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
	
	//˫���弼�����ȼ��ص��ڴ��ټ��ص�����
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(500,500);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
}
