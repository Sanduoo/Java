 package cn.sxt.collection;

public class MyLinkList {
	
	
	private Node frist;
	private Node last;
	private int size;
	
	public void add(Object object) {
		Node node= new Node();
		if (frist==null) {
			node.setPrevious(null);
			node.setObject(object);
			node.setNext(null);
			frist = node;
			last = node;
		}else {
			/**直接往last节点后增加新的节点**/
			node.setPrevious(last);
			node.setObject(object);
			node.setNext(null);
			last.setNext(node);
			last =node;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public Node node(int index) {
		Node temp = null;
		if (frist!=null) {
			if (index<(size>>1)) {
				temp = frist;
			}
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}else {
			temp = last;
			for (int i = size -1; i >index; i--) {
				 temp = temp.previous;
			}
		}
		return temp;
	}
	
	private void rangeCheck(int index) {
    	if (index<0||index>=size) {				//容器有三个对象，size=3，length=4，index(max)=2；当index=size时=null
    			try {
    					throw new Exception();				//自定义异常
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    	}
    }
	
	/**获取指定索引位置对象**/
	public Object get(int index) {
		rangeCheck(index);
		//0	1	2	3	4
		Node temp = node(index);
		if (temp!=null) {
			return temp.object;
		}
		return null;
	}

	
	/**删除指定索引位置对象**/
	public void remove(int index) {
		Node temp = node(index);
		if (temp!=null) {
			Node front = temp.previous;			 
			Node latter = temp.next;			
			front.next = latter;
			latter.previous = front;
			size--;
		}
	}
	
	
	public void add(int index,Object object) {
		Node temp = node(index);
		
		Node newnode = new Node();				//创建一个新的节点
		newnode.object = object;
		
		if (temp!=null) {
			Node front = temp.previous;	
			front.next = newnode;				//front下一个节点是新节点
			newnode.previous = front;		//新节点的前一个节点是front
			
			newnode.next = temp;				//新节点的下一个节点是temp
			temp.previous = newnode;		//temp的前一个节点是新节点
			size++;
		}
	}
	
	
	public static void main(String[] args) {
		MyLinkList list = new MyLinkList();
		list.add("aaa");
		list.add("bbb");
		list.add(1, "aba");
		list.add("ccc");
//		list.remove(1);
		System.out.println(list.get(1));
	}
	
}




	
	
	
