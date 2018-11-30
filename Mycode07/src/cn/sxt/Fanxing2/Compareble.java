package cn.sxt.Fanxing2;

/**
 * 泛型接口：于继承同理
 * 重写方法随父类而定
 * @author Admin
 *
 * @param <T>
 * TODO 149  0.11	
 */
public interface Compareble<T> {
	void compare(T t);
}

//声明子类具体类型
class Comp<Sting> implements Compareble<Integer>{

	@Override
	public void compare(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}

//擦除
class Comp1 implements Compareble{

	@Override
	public void compare(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//父类擦除，子类泛型
class Comp2<T> implements Compareble{

	@Override
	public void compare(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//子类泛型大于等于父类泛型
class Comp3<T> implements Compareble<T>{

	@Override
	public void compare(T t) {
		// TODO Auto-generated method stub
		
	}
	
}

//错误：父类泛型，子类擦除