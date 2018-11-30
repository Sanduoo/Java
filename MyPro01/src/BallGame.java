import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;				//С��ĺ�����
	double y=100;				//С���������
	boolean right = true;				//����
	
	/**�����ڵķ���*/
	public void paint(Graphics g) {
		
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		if(right) {
	    	x = x+10;	
		}else {
			x = x-10;
		}
		
		if(x>856-40-30) {				//856���ڿ�ȣ�40����߿�30С��ֱ��
			right = false;
		}
		
		if(x<0+40) {				//40����
			right = true;
		}
	}
	
	
	
	/**���ڼ���*/
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		/**�ػ����ڣ�ÿ���ػ�25��*/
		while(true) {
			repaint();
			try {
				Thread.sleep(40);				//40���룬��Լһ�뻭25�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//Note: main�����ǳ�ִ�е����
  public static void main(String args[]) {
    System.out.println("Hello!Welcome to playing Game!");
    BallGame game = new BallGame();
    game.launchFrame();
  
  }
  
}
