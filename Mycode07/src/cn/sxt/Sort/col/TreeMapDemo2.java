package cn.sxt.Sort.col;

import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		Worker worker = new Worker("��Ʒ����",3000 );
		Worker worker2 = new Worker("����Ա",2000 );
		Worker worker3 = new Worker("�ϰ�",4000 );
		Worker worker4 = new Worker("ʵϰ��",1000 );
		
		TreeMap<Worker,String> emloyees = new TreeMap<>();
		emloyees.put(worker,"����");
		emloyees.put(worker2,"����");
		emloyees.put(worker3,"����");
		emloyees.put(worker4,"����");
		
		System.out.println(emloyees.keySet());
	}
}
