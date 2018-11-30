package com.sxt.IO2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ��������
 * 1��д�����ȡ
 * 2����ȡ��˳����д������һ��
 * 3���������еĶ��󶼿������л�Serializable
 * 
 * ObjectOutputStream
 * ObjectInputStream
 * @author SanDuo
 *
 */
public class ObjectTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//д��-->���л�
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		ObjectOutputStream ooStream = new ObjectOutputStream(new BufferedOutputStream(boStream));
		//������������+����
		try {
			ooStream.writeUTF("����������");
			ooStream.writeInt(18);
			ooStream.writeBoolean(false);
			ooStream.writeChar('a');
		//����
			ooStream.writeObject("˭������ζ");
			ooStream.writeObject(new Date());
			Employee emp = new Employee("����",20);
			ooStream.writeObject(emp);
			ooStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[ ] datas = boStream.toByteArray();
		//��ȡ-->�����л�
		ObjectInputStream oiStream = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//˳����д��һ��
		try {
			String msg = oiStream.readUTF();
			int age = oiStream.readInt();
			boolean flag = oiStream.readBoolean();
			char ch = oiStream.readChar();
			System.out.println(msg+age+flag+ch);
			//��������ݻ�ԭ
			Object str =oiStream.readObject();
			Object date = oiStream.readObject();
			Object emp = oiStream.readObject();
			if (str instanceof String) {
				String strObj = (String)str;
				System.out.println(strObj);
			}
			if (date instanceof Date) {
				Date dateObj = (Date)date;
				System.out.println(dateObj);
			}
			if (emp instanceof Employee) {
				Employee empObj = (Employee)emp;
				System.out.println(empObj.getName()+"--"+empObj.getSalary());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//Javabean  ��װ����
class Employee implements java.io.Serializable {
	private transient String name;				//transient����
	private double salary;
	public Employee() {
	}
	public Employee (String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
