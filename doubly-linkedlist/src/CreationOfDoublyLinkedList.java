
public class CreationOfDoublyLinkedList {

	public static void main(String[] args) {
		Dll dll = new Dll(4);
		int i=20+ +9- -12+ +4- -13+ +19;
		System.out.println(i);

	}

}

class Dll {
	public Dll(int size) {
		this.size = size;
	}

	Node head;
	Node tail;
	int size;

	class Node {
		public Node(String data) {
			this.data = data;
		}

		String data;
		Node prev;
		Node next;
	}
	public void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
		}
		System.out.println();
	}
	public void insertAtFirst(String value) {
		
		Node first= new Node(value);
		first.prev=null;
		first.next=null;
	}

}