
public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		SclStructure scl = new SclStructure(5);
		scl.insertAtFirst(2);
		scl.insertAtFirst(4);
		scl.insertAtFirst(6);
		scl.insertAtFirst(67);
		scl.insertAtFirst(78);
		//scl.display();
		scl.insertAtLast(3);
		scl.display();
	}

}
class SclStructure{
	Node head;
	Node tail;
	int size;
	
	public SclStructure(int size) {
		this.size=size;
	}
	
	class Node{
		Node next;
		int value;
		
		public Node(int value) {
			this.value=value;
		}
	}
	public void insertAtFirst(int value) {
		Node n = new Node(value);
		if(head==null) {
			head=n;
			n.next=n;
			return;
			
		}
		Node tail = head;
		while(tail.next!=head) {
			tail=tail.next;
			
		}
		
		n.next=head;
		head=n;
		tail.next=head;
		
		
	}
	public void insertAtLast(int value) {
		Node n = new Node(value);
		Node currNod=head;
		while(currNod.next!=head) {
			 currNod=currNod.next;
		}
		currNod.next=n;
		n.next=head;
	}
	public void display() {
		Node currNod=head;

		do {
			System.out.print(currNod.value +"->");
			currNod=currNod.next;
		} while (currNod.next!=head);
		System.out.print(currNod.value +"->");
		System.out.print(currNod.next.value +"");
	}
}
