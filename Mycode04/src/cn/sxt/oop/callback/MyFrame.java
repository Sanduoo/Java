package cn.sxt.oop.callback;


public class MyFrame {
	public void paint ( ) {
		System.out.println("���Լ����ڻ�����");
	}
}


/*
public abstract class MyFrame01 {
	public abstract void paint01 ( );
}
*/

interface IMyFrame{
	void paint();
}