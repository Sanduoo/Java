package cn.sxt.collection;
/**
 * 节点
 * @author Admin
 *
 */
public class Node {
	 Node previous;				//上一个节点(节点类型)
	 Object object;
	 Node next;						//下一个节点
	
	/**空构造器**/
	public Node(){
	}
	
	/**构造器**/
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
