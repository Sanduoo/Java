package cn.sxt.collection;
/**
 * �ڵ�
 * @author Admin
 *
 */
public class Node {
	 Node previous;				//��һ���ڵ�(�ڵ�����)
	 Object object;
	 Node next;						//��һ���ڵ�
	
	/**�չ�����**/
	public Node(){
	}
	
	/**������**/
	public Node(Node previous, Object object, Node next) {
		super();
		this.previous = previous;
		this.object = object;
		this.next = next;
	}
	

	/**Getters-Setters**/
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
