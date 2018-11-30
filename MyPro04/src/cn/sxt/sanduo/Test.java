package cn.sxt.sanduo;

import cn.sxt.oo.User;			//导入了cn.sxt.oo包下的User类
import cn.sxt.oo.*;				//导入cn.sxt.oo包下所有的类（但会降低编译速度）

import java.util.*;
import java.sql.*;

import static java.lang.Math.*;		//静态导入

public class Test {
	public static void main(String[] args) {
		
		User user = new User();
		/**	cn.sxt.oo.User user = new cn.sxt.oo.User();	**/
		
		/**	Date date = new Date();				//导入多个包后出现类重名现象	**/  
		//解决方法			java.util.Data.Date			指明具体的包
		
		System.out.println(Math.PI);
		System.out.println(PI); 			    	//静态导入后不需要写Math.PI，编译器自动识别出PI属于Math类下的静态属性PI
		
	}
}
