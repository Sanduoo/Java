package cn.sxt.Fanxing;

/**
 * ����Ϊ����
 * 1.����
 * 2.����
 * @author Admin
 *
 */
public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);
}

/*
 * ��������ʱָ����������
 * ��������Ϊ��������
 * ����ͬ��
 * 
 */
class Child1 extends Father<String,Integer>{
	String t2;
	public void test(String t) {
	}
}

/*
 * ����Ϊ�����࣬������ʹ��ʱ��ȷ
 * 
 */
class Child2<T1,T> extends Father<T,T1>{
	T t2;
	public void test(T t) {
	}
}

/*
 * ����Ϊ�����࣬���಻ָ������
 * 
 */
