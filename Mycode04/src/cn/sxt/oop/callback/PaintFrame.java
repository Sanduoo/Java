package cn.sxt.oop.callback;



public class PaintFrame {
	public static void drawFrame(IMyFrame f) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		/* ������ */
		
		f.paint();
		
		System.out.println("�������棬����Ч��");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());						//Hook   ���ӣ�����callback�ص�
		 
	}
}

class GameFrame extends MyFrame{
	@Override
	public void paint() {
		System.out.println("GameFrame.paint()");
		System.out.println("������");
	}
}

class GameFrame01 implements IMyFrame{
	@Override
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("������er");
	}
}