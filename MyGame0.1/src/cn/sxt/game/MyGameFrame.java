package cn.sxt.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import org.omg.PortableServer.POAPackage.WrongAdapter;

/**
 * 飞机游戏的主窗口
 * @author Admin
 *
 */
public class MyGameFrame extends JFrame{
	
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
