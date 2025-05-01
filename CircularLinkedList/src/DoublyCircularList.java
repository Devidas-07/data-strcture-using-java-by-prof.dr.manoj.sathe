

public class DoublyCircularList {

	public static void main(String[] args) {
		Dcl dcl = new Dcl(22);
		dcl.addFirst("I");
		dcl.addFirst("am");
		dcl.addFirst("mibs");
		dcl.addFirst("student");
		dcl.addFirst("of");
		dcl.addFirst("mca");
		dcl.display();
		
		dcl.addLast("last");
		
		dcl.display();
		dcl.removeFirst();
		dcl.removeFirst();
		dcl.removeLast();
		System.out.println();
		dcl.display();

	}

}
class Dcl{
	Node head;
	Node tail;
	int size;
	
	public Dcl(int size) {
		this.size=size;
	}
	class Node{
		Node prev;
		Node next;
		String data;
		
		public Node(String data) {
			this.data=data;
		}
		
	}
	public void addFirst(String data) {
		if(head==null) {
			Node newNode = new Node(data);
			newNode.next=newNode;
			newNode.prev=newNode;
			head=newNode;
			tail=newNode;
			return;
		}
		Node newNode= new Node(data);
		
		newNode.next=head;
		newNode.prev=tail;
		head.prev=newNode;
		tail.next=newNode;
		head=newNode;
	}

	public void display() {
	    if (head == null) {
	        System.out.println("List is empty.");
	        return;
	    }
	    Node currNod = head;
	    do {
	        System.out.print(currNod.data + " -> ");
	        currNod = currNod.next;
	    } while (currNod != head); 
	    System.out.println(head.data);
	}


	public void addLast(String data) {
		if(head==null) {
			Node n = new Node(data);
			head=n;
			tail=n;
			n.next=n;
			n.prev=n;
			return;
			
		}
		Node n = new Node(data);
		tail.next=n;
		n.prev=tail;
		n.next=head;
		tail=n;
		head.prev=tail;
	}
	public void removeFirst() {
		head=head.next;
		head.prev=tail;
		tail.next=head;
	}
	public void removeLast() {
		tail=tail.prev;
		tail.next=head;
		head.prev=tail;
		
	}
}