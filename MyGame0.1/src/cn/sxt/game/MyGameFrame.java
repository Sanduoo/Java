package cn.sxt.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.omg.PortableServer.POAPackage.WrongAdapter;

/**
 * �ɻ���Ϸ��������
 * @author Admin
 *
 */
public class MyGameFrame extends JFrame{
	
	/*��ʼ������*/
	public void launchFrame() {
		this.setTitle("����");							//���ڱ���
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

		
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
