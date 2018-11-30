package cn.sxt.HashtableAndHashMap;

/**
 * 一、Hashtable和HashMap的区别
 * 1、主要：Hashtable线程安全，同步，效率相对低下
 * 				   HashMap线程不安全，非同步，效率相对较高
 *2、父类：Hashtable是Dictionary，HashMap是Abstract
 *3、null：Hashtable键与值不能为空
 *				 HashMap键最多一个null，值可以多个null
 * 
 * 二、Hashtable子类Properties
 * 1、作用：读写资源配置文件
 * 2、键与值只能为字符串
 * 3、方法：
 * 		Object	 setProperty(String key, String value) 		调用Hashtable方法put 。 
 * 		String  	 getProperty(String key) 		使用此属性列表中指定的键搜索属性。 （不存在返回空）
 * 		String	 getProperty(String key, String defaultValue) 	使用此属性列表中指定的键搜索属性。（不存在返回默认值）
 * 
 * ---存储---
 *  后缀properties
 * 		void		 store(OutputStream out, String comments) 		将此属性列表（键和元素对）写入此 Properties表中，
 * 																								以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。  
		void 		store(Writer writer, String comments) 		将此属性列表（键和元素对）写入此 Properties表中，
																						以适合使用 load(Reader)方法的格式输出到输出字符流。 
 * 后缀XML
 *	   void 		storeToXML(OutputStream os, String comment) 		发出表示此表中包含的所有属性的XML文档。 （UTF-8）
 *		void 		storeToXML(OutputStream os, String comment, String encoding) 	使用指定的编码发出表示此表中包含的所有属性的XML文档。
 * 
 * ---获取---
 * 		void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。 
 * 		void load(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
 *  
 * 		void loadFromXML(InputStream in) 将指定输入流中的XML文档表示的所有属性加载到此属性表中。 
 * @author Admin
 * 
 *
 */
public class HashtableAndHashMap {

}
