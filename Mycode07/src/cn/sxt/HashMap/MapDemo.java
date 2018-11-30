package cn.sxt.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����һ��Student�࣬���ԣ�name������classNumber��ţ�score�ɼ�
 * ���ڽ�����Student�������List����ͳ�Ƴ�ÿ������ֺܷ�ƽ���֣��ֱ��ӡ����
 * @author Admin
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		List<Student> list= new ArrayList<>();
		exam(list);
		
		//ͳ��
		Map<String, Classroom> rooms = new HashMap<String,Classroom>();
		count(rooms,list);
		//��ӡ
		printScore(rooms);
	}
	
	/*��ӡ�ܷ���ƽ����*/
	public static void printScore(Map<String, Classroom> rooms) {
		Set<Map.Entry<String, Classroom>> entrySet = rooms.entrySet(); 
		Iterator<Map.Entry<String, Classroom>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Classroom> entry = it.next();
			Classroom room = entry.getValue();
			double avg = room.getTotal()/room.getStudents().size();
			System.out.println("���Ϊ��"+room.getNo()+"�ܷ�Ϊ��"+room.getTotal()+"ƽ���֣�"+avg);
		}
		
	}
	
	/*ͳ�Ʒ���*/
	public static void count(Map<String, Classroom> rooms,List<Student> list) {
		for(Student student:list) {
			String no = student.getNumber();
			double score = student.getScore();
			/*���ݰ༶���  �鿴Map�Ƿ���ڸð༶   ���ּ�˼·��*/
			Classroom room = rooms.get(no);
			if (room==null) {				//��������
				room = new Classroom(no); 
				rooms.put(no, room);
			}
			/*�洢*/
			room.setTotal(room.getTotal()+score);		
			room.getStudents().add(student);				//����ѧ��
		}
	}
	
	/*���ڽ�����Student�������List*/
	public static void exam(List<Student> list) {
		list.add(new Student("����","001" , 81));
		list.add(new Student("�Ķ�","001" , 82));
		list.add(new Student("���","002" , 83));
		list.add(new Student("����","002" , 84));
		list.add(new Student("�߶�","003" , 85));
		list.add(new Student("�˶�","003" , 86));
	}
	
}
