package cn.sxt.Fanxing;

/**
 * 接口中泛型字母只能使用在方法中，不能使用在全局常量中
 * @author Admin
 *
 */
public interface Comparator<T> {
	int A = 2;
	void compare(T t);

}
