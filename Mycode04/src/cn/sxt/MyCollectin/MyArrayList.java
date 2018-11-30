package cn.sxt.MyCollectin;

import java.awt.List;

/**
 * 模拟实现JDK中提供的ArrayList类
 * @author Admin
 *ArrayList
 *
 *插入某个元素
 *删除某个元素
 *
 */
public class MyArrayList {
	/**
     * The value is used for object storage.
     */
    private Object[ ] value;

    /**
     * The size is the number of characters used.
     */
    private int size;
    
    public MyArrayList() {
    //	value = new Object[16];
    	this(10);
    }
    
    /**查询value数组长度(size)方法**/
    public int size() {
    	return size;
    }
    
    /**如果容器是空则长度为0**/
    public boolean isEmpty() {
    	return size == 0;
    }
    
    public MyArrayList(int size) {
    	if (size<0) {
    		try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	value = new Object[size];
    }
    
    /**添加方法**/
    public void add(Object obj) {
    	value[size] = obj;
    	size++;
    	if (size>=value.length) {				//装不下，准备扩容
			int newCapacity = value.length*2+2;
			Object[ ] newList = new Object[newCapacity];
			//System.arraycopy(src, srcPos, dest, destPos, length);				//拷贝数组
			
			/**拷贝数组**/
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];				//把value数组拷贝到newList内（作用：扩容后保存原数组中的内容 ）
			}
			
			value = newList;
		}
    }
    
    /**get方法可被list调用**/
    //Note: index索引范围[0，size-1]
    public Object get(int index) {
    	rangeChech(index); 	
    	
    	return value[index];
    }
    
    /**方法：数组遍历，查询数组中与obj相同的元素**/
    //Note: Object obj-目标对象
    public int indexOf(Object obj) {
    	if (obj ==null) {
			return -1;
		}else {
			for (int i = 0; i < value.length; i++) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
    }
    /**从尾到头**/
    public int lastindexOf(Object obj) {
    	if (obj ==null) {
			return -1;
		}else {
			for (int i = value.length-1; i>=0; i--) {
				if (obj==value[i]) {
					return i;
				}
			}
			return -1;
		}
    }
    
    public Object set(int index, Object object) {
    	rangeChech(index); 				
    	
    	Object old = value[index];
        value[index] = object;
        return old;
    }
    
    /**建一个专用于判定index是否超范围的方法**/
    public void rangeChech(int index) {
    	if (index<0||index>size-1) {
			try {
				throw new Exception();				//手动抛出异常程序停止
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
    public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		
		//Note: list.add();对象长度可变，size可自动扩充
		list.add("aaa");
		list.add(new Human("三多"));				//丢入一个Human对象
		list.add("bbb");
		
		/**强制转型（get方法返回值是Object类型，index索引的是Human类型）**/
		Human h =(Human)list.get(1);
		System.out.println(h.getName());
		System.out.println(list.get(2));
		//System.out.println(list.get(3));
		//System.out.println(list.get(-1));				//超出范围，抛出异常
		System.out.println(list.size);

	}
}
