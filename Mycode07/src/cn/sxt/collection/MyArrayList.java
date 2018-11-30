package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 自己实现一个ArrayList，帮助我们更好得理解ArrayList类的底层结构
 * @author Admin
 *
 */

public class MyArrayList  {
	private Object[ ] elementData;
	private int size;
	/**数组长度**/
	public int size() {
		return size;
	}
	/**是否为空**/
	public boolean isEmpty() {
		return size==0;
	}
	public MyArrayList() {
		this(10);				//数组默认大小是10
	}
	
	
	
	/**初始化**/
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
	
	
	
	/**数据拷贝**/
	public void add(Object object) {
		Dilatation(object);
		elementData[size++] = object;
	}
	
	
	
	/**数组扩容**/
	public void Dilatation(Object object) {
		if (size==elementData.length) {					//如果数组数据长度等于 数组空间长度
			Object[ ] newArray = new Object[size*2+1];					//size*2+1
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);				//把原数组的元素拷贝到新数组
			/*
			for (int i = 0; i < elementData.length; i++) {
				newArray[i] = elementData[i];
			}
			*/
			elementData = newArray;
 		}
	}
	
	
	/**返回指定位置的值**/
	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}
	
	
	
	/**删除指定位置的对象**/
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
			if (get(i).equals(object)) {				//底层调用的是equals方法而不是==
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
	
	
	
	/**索引判断index**/
    private void rangeCheck(int index) {
    	if (index<0||index>=size) {				//容器有三个对象，size=3，length=4，index(max)=2；当index=size时=null
    			try {
    					throw new Exception();				//自定义异常
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
