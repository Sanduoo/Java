package cn.sxt.Fanxing;

/**
 * 父类为泛型
 * 1.属性
 * 2.方法
 * @author Admin
 *
 */
public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);
}

/*
 * 子类声明时指定具体类型
 * 属性类型为具体类型
 * 方法同理
 * 
 */
class Child1 extends Father<String,Integer>{
	String t2;
	public void test(String t) {
	}
}

/*
 * 子类为泛型类，类型在使用时正确
 * 
 */
class Child2<T1,T> extends Father<T,T1>{
	T t2;
	public void test(T t) {
	}
}

/*
 * 子类为泛型类，父类不指定类型
 * 
 */
