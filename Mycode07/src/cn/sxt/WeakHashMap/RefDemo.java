package cn.sxt.WeakHashMap;

import java.lang.ref.WeakReference;

/**
 * 引用分类：强、软、弱、虚
 * 强与弱引用
 * @author Admin
 *
 */
public class RefDemo {
	public static void main(String[] args) {
//		字符串常量池
		String str = new String("SanDuoo is good boy");
//		弱引用管理对象
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("cg运行前"+wr.get());
//		断开引用
		str = null;
//		回收通知
		System.gc();
		System.runFinalization();
//		对象被回收
		System.out.println("cg运行后"+wr.get());
	}
	public static void testStrong() {
//		字符串常量池共享不能回收
		String str = "SanDuoo is good boy";
//		弱引用管理对象
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("cg运行前"+wr.get());
//		断开引用
		str = null;
//		回收通知
		System.gc();
		System.runFinalization();
		System.out.println("cg运行后"+wr.get());
	}
}
