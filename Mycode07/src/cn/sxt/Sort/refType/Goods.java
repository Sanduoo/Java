package cn.sxt.Sort.refType;

/**
 * ʵ����
 * @author Admin
 *
 */
public class Goods {
	private String name;	//����
	private int fav;				//�ղ���
	private double price;	//�۸�
	
	public Goods() {
	}
	
	public Goods(String name,int fav, double price ) {
		super();
		this.fav = fav;
		this.price = price;
		this.name = name;
	}
	
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "��Ʒ����"+name+"���ղ���"+this.fav+"���۸�"+this.price+"\n";
	}
}
