
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
		scl.display(); //78->67->6->4->2->3->78
		System.out.println();
		scl.removeFirst();
		scl.removeLast();
		scl.display();
//		scl.removeLast();
		//scl.display();
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
			tail=n;
			return;
			
		}
//		Node tail = head;
//		while(tail.next!=head) {
//			tail=tail.next;
//			
//		}
		
		n.next=head;
		head=n;
		tail.next=n;
		
		
	}
	public void insertAtLast(int value) {
		Node n = new Node(value);
		Node currNod=head;
		while(currNod.next!=head) {
			 currNod=currNod.next;
		}
		currNod.next=n;
		n.next=head;
		tail=n;
		
	}
	public void display() {
		Node currNod=head;

		do {
			System.out.print(currNod.value +"->");
			currNod=currNod.next;
		} while (currNod!=head);
		System.out.print(currNod.value +"->");
		System.out.print(currNod.next.value +"");
	}
	public void removeFirst() {
		Node currNode= head;
		while(currNode.next!=head) {
			currNode=currNode.next;
		}
		
		head=head.next;
		currNode.next=head;
	}
	public void removeLast() {
		Node secondLast=head;
		Node last=head.next;
		
		while(last.next!=head) {
			secondLast=last;
			last=last.next;
		}
		secondLast.next=head;
	}
}
