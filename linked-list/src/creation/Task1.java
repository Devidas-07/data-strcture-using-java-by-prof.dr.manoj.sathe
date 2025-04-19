package creation;

public class Task1 {

	public static void main(String[] args) {
		
		LinkedListStructure ll = new LinkedListStructure(10);
		ll.insertAtFirst(78);
		ll.insertAtFirst(8);
		ll.insertAtFirst(7);
		ll.insertAtFirst(12);
		ll.insertAtFirst(82);
		ll.insertAtFirst(70);
		System.out.println("============");
		//ll.display();
		ll.insertAtRandom(56, 1);
		ll.display();
	}

}
class LinkedListStructure{
	public LinkedListStructure(int size) {
		this.size=size;
	}
	Node head;
	Node tail;
	int size;
	
	class Node{
		public Node(int value) {
			this.value=value;
		}
		int value;
		Node next;
		
	}
	public void insertAtFirst(int value) {
		Node n = new Node(value);
		if(head==null) {
			head=n;
			return;
		}
		n.next=head;
		head=n;
	}
	public void display() {
		Node currNod= head;
		while(true) {
			if(currNod.next!=null) {
				System.out.print(currNod.value +"-> ");
				currNod=currNod.next;
			}
			else if(currNod.next==null) {
				System.out.print(currNod.value);
				break;
			}
			
			//System.out.println(currNod.value);
			
		}
		
	}
	public void insertAtRandom(int userValue, int pos) {
		if(pos==1) {
			insertAtFirst(userValue);
			return;
		}
		Node currNode= head;
		Node nextNode = head.next;
		
		for(int count=2; count<pos; count++) {
			
			currNode=currNode.next;
			nextNode=nextNode.next;
			//System.out.println("value is "+currNode.value);
		}
		Node randNode = new Node(userValue);
		currNode.next=randNode;
		randNode.next=nextNode;
		
	}
}