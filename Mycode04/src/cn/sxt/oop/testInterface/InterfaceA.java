package cn.sxt.oop.testInterface;

public interface InterfaceA {
	void aaa();
}

interface InterfaceB{
	void bbb();
}

interface InterfaceC extends InterfaceA,InterfaceB{				//�ӿڿ��Զ�̳�
	void ccc();
}

class TestClass implements InterfaceC{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

}