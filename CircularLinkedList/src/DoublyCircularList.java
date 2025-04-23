
public class DoublyCircularList {

	public static void main(String[] args) {
		Dcl dcl = new Dcl(2);
		dcl.addFirst("I");
		dcl.addFirst("am");
		dcl.addFirst("mibs");
		dcl.addFirst("student");
		dcl.addFirst("of");
		dcl.addFirst("mca");
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
			tail=head;
		}
		Node newNode= new Node(data);
		
		newNode.next=head;
		newNode.prev=tail;
		head.prev=newNode;
		head=newNode;
	}
	public void display() {
		Node currNode=head;
		
		while(currNode.next!=tail) {
			System.out.print(currNode.data+" ->");
			currNode=currNode.next;
			
			
		}
		System.out.print(tail.data+" ->");
		System.out.print(head.data);
	}
}