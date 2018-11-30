package cn.sxt.Fanxing2;

import java.util.jar.Attributes.Name;

/**
 * 父类为泛型类
 * 1、属性
 * 2、方法
 * 
 * 要么同时擦除，要么子类类型大于等于父类类型
 * 不能子类擦除父类泛型
 * 
 * 1、属性类型
 * 		父类中，随父类型定
 * 		子类中，随随子类定
 * 2、方法重写
 * 		随父类而定
 * @author Admin
 *
 * @param <T>
 */
public abstract class Father<T> {
	T name;
	public abstract void test(T t) ;
		
}

/*
 * 子类声明时指定具体类型
 * 属性类型为具体类型
 * 方法同理
 */
class Child extends Father<String>{
	String t2;
	public void test(String t){
		
	}
}

/*
 * 子类为泛型类，类型在使用时确定
 * 
 * 
 */
class Child2<T> extends Father<T>{
	T t2;
	public void test(T t){
		
	}
}

/*
 * 子类为泛型类，父类不指定类型，泛型的擦除，使用Object
 */
class Child3<T1,T2> extends Father{				//父类Object
	T1 name2;
	@Override
	public void test(Object t) {
		
	}
}

/*
 *子类和父类同时擦除 
 */
class Child4 extends Father{				//父类、子类Object
	String name;
	@Override
	public void test(Object t) {

	}
}

/**
 * TODO 错误：子类擦除父类使用泛型
 *  Note：只能同时擦除或者父类擦除

class Child5 extends Father<T>{
	String name;
	@Override
	public void test(T t) {
		
	}
}
*/