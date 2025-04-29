
public class CreationOfDoublyLinkedList {

	public static void main(String[] args) {
		Dll dll = new Dll(10);
		dll.insertAtFirst("Hello");
		dll.inserAtLast("I");
		dll.inserAtLast("am");
		dll.inserAtLast("a");
		dll.inserAtLast("student");
		dll.insertAtFirst("hey");
		
		
		dll.display();
		dll.removeFirst();
		dll.display();
		dll.removeLast();
		dll.display();
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
		public Node(String value) {
			this.value = value;
		}

		String value;
		Node prev;
		Node next;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value + " ");
			temp=temp.next;
		}
		System.out.println();
	}

	public void insertAtFirst(String value) {
		if (head == null) { //when there is no elements
			Node first = new Node(value);
			first.prev = null;
			first.next = null;
			head=first;
			tail=first;//we are keeping tail constant in insertFirst method
			return;
		}
		Node n = new Node(value);
		n.next=head;
		n.prev=null;
		head.prev=n;
		head=n;
	}
	public void inserAtLast(String value) {
		if(tail==null) {
			Node last= new Node(value);
			last.next=null;
			last.prev=null;
			tail=last;//we are keeping head constant and just shifting tail one by one ahead
			return;
		}
		Node n = new Node(value);
		tail.next=n;
		n.prev=tail;
		tail=n;
		tail.next=null;
	}
	public void removeFirst() {
		head=head.next;
		head.prev=null;
		
	}
	public void removeLast() {
		tail=tail.prev;
		tail.next=null;
		
	}

}