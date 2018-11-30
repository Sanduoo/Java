package cn.sxt.Sort.refType;

/**
 * 实体类
 * @author Admin
 *
 */
public class Goods {
	private String name;	//名称
	private int fav;				//收藏量
	private double price;	//价格
	
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
		return "商品名："+name+"，收藏量"+this.fav+"，价格"+this.price+"\n";
	}
}
