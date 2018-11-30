package cn.sxt.Sort.col;

import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		Worker worker = new Worker("产品经理",3000 );
		Worker worker2 = new Worker("程序员",2000 );
		Worker worker3 = new Worker("老板",4000 );
		Worker worker4 = new Worker("实习生",1000 );
		
		TreeMap<Worker,String> emloyees = new TreeMap<>();
		emloyees.put(worker,"三多");
		emloyees.put(worker2,"三多");
		emloyees.put(worker3,"三多");
		emloyees.put(worker4,"三多");
		
		System.out.println(emloyees.keySet());
	}
}
