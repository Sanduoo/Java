package cn.sxt.Sort.col;

import java.util.TreeSet;
/**
 * ʵ����ʵ��Comparable�ӿڵ�Ӧ��
 * @author Admin
 *
 */
public class TreeSetDome2 {
	public static void main(String[] args) {
		Worker worker = new Worker("��Ʒ����",3000 );
		Worker worker2 = new Worker("����Ա",2000 );
		Worker worker3 = new Worker("�ϰ�",4000 );
		Worker worker4 = new Worker("ʵϰ��",1000 );
		
		TreeSet<Worker> emloyees = new TreeSet<>();
		emloyees.add(worker);
		emloyees.add(worker2);
		emloyees.add(worker3);
		emloyees.add(worker4);
		
		System.out.println(emloyees);
	}
}
