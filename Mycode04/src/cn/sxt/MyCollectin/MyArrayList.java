package cn.sxt.MyCollectin;

import java.awt.List;

/**
 * ģ��ʵ��JDK���ṩ��ArrayList��
 * @author Admin
 *ArrayList
 *
 *����ĳ��Ԫ��
 *ɾ��ĳ��Ԫ��
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
    
    /**��ѯvalue���鳤��(size)����**/
    public int size() {
    	return size;
    }
    
    /**��������ǿ��򳤶�Ϊ0**/
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
    
    /**��ӷ���**/
    public void add(Object obj) {
    	value[size] = obj;
    	size++;
    	if (size>=value.length) {				//װ���£�׼������
			int newCapacity = value.length*2+2;
			Object[ ] newList = new Object[newCapacity];
			//System.arraycopy(src, srcPos, dest, destPos, length);				//��������
			
			/**��������**/
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];				//��value���鿽����newList�ڣ����ã����ݺ󱣴�ԭ�����е����� ��
			}
			
			value = newList;
		}
    }
    
    /**get�����ɱ�list����**/
    //Note: index������Χ[0��size-1]
    public Object get(int index) {
    	rangeChech(index); 	
    	
    	return value[index];
    }
    
    /**�����������������ѯ��������obj��ͬ��Ԫ��**/
    //Note: Object obj-Ŀ�����
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
    /**��β��ͷ**/
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
    
    /**��һ��ר�����ж�index�Ƿ񳬷�Χ�ķ���**/
    public void rangeChech(int index) {
    	if (index<0||index>size-1) {
			try {
				throw new Exception();				//�ֶ��׳��쳣����ֹͣ
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
    public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		
		//Note: list.add();���󳤶ȿɱ䣬size���Զ�����
		list.add("aaa");
		list.add(new Human("����"));				//����һ��Human����
		list.add("bbb");
		
		/**ǿ��ת�ͣ�get��������ֵ��Object���ͣ�index��������Human���ͣ�**/
		Human h =(Human)list.get(1);
		System.out.println(h.getName());
		System.out.println(list.get(2));
		//System.out.println(list.get(3));
		//System.out.println(list.get(-1));				//������Χ���׳��쳣
		System.out.println(list.size);

	}
}
