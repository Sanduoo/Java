package cn.sxt.oop.callback;


public class MyFrame {
	public void paint ( ) {
		System.out.println("把自己窗口画出来");
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