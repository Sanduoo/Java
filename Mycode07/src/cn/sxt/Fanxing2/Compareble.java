package cn.sxt.Fanxing2;

/**
 * ���ͽӿڣ��ڼ̳�ͬ��
 * ��д�����游�����
 * @author Admin
 *
 * @param <T>
 * TODO 149  0.11	
 */
public interface Compareble<T> {
	void compare(T t);
}

//���������������
class Comp<Sting> implements Compareble<Integer>{

	@Override
	public void compare(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}

//����
class Comp1 implements Compareble{

	@Override
	public void compare(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//������������෺��
class Comp2<T> implements Compareble{

	@Override
	public void compare(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//���෺�ʹ��ڵ��ڸ��෺��
class Comp3<T> implements Compareble<T>{

	@Override
	public void compare(T t) {
		// TODO Auto-generated method stub
		
	}
	
}

//���󣺸��෺�ͣ��������