package cn.sxt.Fanxing2;

import java.util.jar.Attributes.Name;

/**
 * ����Ϊ������
 * 1������
 * 2������
 * 
 * Ҫôͬʱ������Ҫô�������ʹ��ڵ��ڸ�������
 * ��������������෺��
 * 
 * 1����������
 * 		�����У��游���Ͷ�
 * 		�����У��������ඨ
 * 2��������д
 * 		�游�����
 * @author Admin
 *
 * @param <T>
 */
public abstract class Father<T> {
	T name;
	public abstract void test(T t) ;
		
}

/*
 * ��������ʱָ����������
 * ��������Ϊ��������
 * ����ͬ��
 */
class Child extends Father<String>{
	String t2;
	public void test(String t){
		
	}
}

/*
 * ����Ϊ�����࣬������ʹ��ʱȷ��
 * 
 * 
 */
class Child2<T> extends Father<T>{
	T t2;
	public void test(T t){
		
	}
}

/*
 * ����Ϊ�����࣬���಻ָ�����ͣ����͵Ĳ�����ʹ��Object
 */
class Child3<T1,T2> extends Father{				//����Object
	T1 name2;
	@Override
	public void test(Object t) {
		
	}
}

/*
 *����͸���ͬʱ���� 
 */
class Child4 extends Father{				//���ࡢ����Object
	String name;
	@Override
	public void test(Object t) {

	}
}

/**
 * TODO ���������������ʹ�÷���
 *  Note��ֻ��ͬʱ�������߸������

class Child5 extends Father<T>{
	String name;
	@Override
	public void test(T t) {
		
	}
}
*/