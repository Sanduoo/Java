package cn.sxt.Exception;
/**
 * �Զ����쳣
 * @author Admin
 *����һ���쳣��
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