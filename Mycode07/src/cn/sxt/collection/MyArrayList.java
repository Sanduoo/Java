package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * �Լ�ʵ��һ��ArrayList���������Ǹ��õ����ArrayList��ĵײ�ṹ
 * @author Admin
 *
 */

public class MyArrayList  {
	private Object[ ] elementData;
	private int size;
	/**���鳤��**/
	public int size() {
		return size;
	}
	/**�Ƿ�Ϊ��**/
	public boolean isEmpty() {
		return size==0;
	}
	public MyArrayList() {
		this(10);				//����Ĭ�ϴ�С��10
	}
	
	
	
	/**��ʼ��**/
	public MyArrayList(int intialCapacity) {
		if (intialCapacity<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData = new Object[intialCapacity];
	}
	
	
	
	/**���ݿ���**/
	public void add(Object object) {
		Dilatation(object);
		elementData[size++] = object;
	}
	
	
	
	/**��������**/
	public void Dilatation(Object object) {
		if (size==elementData.length) {					//����������ݳ��ȵ��� ����ռ䳤��
			Object[ ] newArray = new Object[size*2+1];					//size*2+1
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);				//��ԭ�����Ԫ�ؿ�����������
			/*
			for (int i = 0; i < elementData.length; i++) {
				newArray[i] = elementData[i];
			}
			*/
			elementData = newArray;
 		}
	}
	
	
	/**����ָ��λ�õ�ֵ**/
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	
	
	/**ɾ��ָ��λ�õĶ���**/
	public void remove(int index) {
		rangeCheck(index);
		int numMoved = size - index - 1;
        if (numMoved > 0) {
        	System.arraycopy(elementData, index+1, elementData, index,
        			numMoved);
        	elementData[--size] = null; // clear to let GC do its work
        }
	}
	
	
	
	public void remove(Object object) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(object)) {				//�ײ���õ���equals����������==
				remove(i);
			}
		}
	}
	
	
	
	public Object set(int index,Object object) {
		rangeCheck(index);
		Object oldValue = elementData[index];
		elementData[index] = object;
		return oldValue;
	}
	
	
	
	/**�����ж�index**/
    private void rangeCheck(int index) {
    	if (index<0||index>=size) {				//��������������size=3��length=4��index(max)=2����index=sizeʱ=null
    			try {
    					throw new Exception();				//�Զ����쳣
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    	}
    }

    
	
    public void add(int index,Object object) {
    	Dilatation(object);				
		rangeCheck(index);			
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index] = object;
		size++;
	}
    
    
    
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);
		list.add("aaa");
		list.add(new Date());
		list.add(1234);
		list.add("aaa");
		list.add(1234);
		System.out.println(list.size());
		System.out.println(list.get(8));
		System.out.println(list.set(1, "111"));
		System.out.println(list.isEmpty());
		
	}
}
