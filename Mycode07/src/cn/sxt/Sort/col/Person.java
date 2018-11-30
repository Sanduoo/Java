package cn.sxt.Sort.col;

public class Person {
	private final String name;				//名称
	private final int handsome;				//帅气指数
	
	public Person() {
		name=null;
		handsome = 0;
	}

	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}

	public String getName() {
		return name;
	}
/*	public void setName(String name) {
		this.name = name;
	}*/
	public int getHandsome() {
		return handsome;
	}
/*	public void setHandsome(int handsome) {
		this.handsome = handsome;
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名："+this.name+"帅气指数："+this.handsome+"\n";
	}
}
