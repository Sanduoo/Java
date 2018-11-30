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
 * �ɻ���Ϸ��������
 * @author Admin
 *
 */
public class MyGameFrame extends JFrame{
	
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	int  planex = 250,planey = 250;
	
	@Override
	public void paint(Graphics g) {			//�Զ������á�g�����൱��һ֧����
		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planex, planey, null);
		planex++;													//�ɻ������ƶ�
	}

	/*����һ���ڲ��ࣨ��������ⲿ��ķ������ԣ�*/
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				System.out.println("�����ػ�һ�Σ�");
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
	
	
	/*��ʼ������*/
	public void launchFrame() {
		this.setTitle("�ɻ�С��Ϸ");				//���ڱ���
		this.setVisible(true);							//���ڿɼ�
		this.setSize(500, 500);						//���ڳߴ�
		this.setLocation(300, 300);				//����λ��
		
		/*���ڹرս�������ָ��*/
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		new PaintThread().start();				//�����ػ����ڵ��߳�
		
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
