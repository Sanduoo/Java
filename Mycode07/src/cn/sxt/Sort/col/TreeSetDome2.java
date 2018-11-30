package cn.sxt.Sort.col;

import java.util.TreeSet;
/**
 * 实体类实现Comparable接口的应用
 * @author Admin
 *
 */
public class TreeSetDome2 {
	public static void main(String[] args) {
		Worker worker = new Worker("产品经理",3000 );
		Worker worker2 = new Worker("程序员",2000 );
		Worker worker3 = new Worker("老板",4000 );
		Worker worker4 = new Worker("实习生",1000 );
		
		TreeSet<Worker> emloyees = new TreeSet<>();
		emloyees.add(worker);
		emloyees.add(worker2);
		emloyees.add(worker3);
		emloyees.add(worker4);
		
		System.out.println(emloyees);
	}
}
