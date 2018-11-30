package cn.sxt.Exception;
/**
 * 自定义异常
 * @author Admin
 *定义一个异常类
 */
public class CustomException extends Exception {
	
	public CustomException() {
		
	}
	
	public CustomException(String massage) {
		super(massage);
	}
	
}

class TestCustomException{
	
	void test()throws CustomException{
		///
	}
	
	public static void main(String[] args) {
		try {
			new TestCustomException().test();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}