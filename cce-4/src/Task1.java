import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		SinglyLLStructure sll = new SinglyLLStructure(6);

		int input=0;
		do {
			System.out.println("enter your choice \t 1 for insert at first \t 2 for insert at last\t 3 for remove first\t 4 for remove last\t 5 for insert at random pos\t 6 for display");
			
			Scanner scan = new Scanner(System.in);
			input=scan.nextInt();
			switch (input) {
			case 1: 
				System.out.println("enter value for insert at first");
				String value = scan.next();
				sll.insertAtFirst(value);
				break;
			case 2:
				System.out.println("enter value for insert at last");
				String value1 = scan.next();
				sll.insertAtLast(value1);
				break;
			case 3:
				sll.removeFirst();
				break;
			case 4:
				sll.removeLast();
				break;
			case 5:
				System.out.println("enter value");
				String rvalue=scan.next();
				System.out.println("enter position");
				int pos=scan.nextInt();
				sll.insertAtRandom(rvalue, pos);
				break;
			case 6:
				sll.display();
				break;
			default:
				System.exit(0);
				
				
			}
		} while (input>0&&input<=6);

	}

}
class SinglyLLStructure{
	Node head;
	Node tail;
	int size;
	
	public SinglyLLStructure(int size) {
		this.size=size;
	}
	class Node{
		Node next;
		String data;
		public Node(String data) {
			this.data=data;
			
		}
		
	}
	public void insertAtFirst(String data) {
		if(head==null) {
			Node first = new Node(data);
			first.next=null;
			head=first;
			tail=first;
			return;
		}
		Node n = new Node(data);
		n.next=head;
		head=n;
	}
	public void insertAtLast(String data) {
		if(tail==null) {
			Node last = new Node(data);
			last.next=null;
			tail=last;
			return;
		}
		Node n = new Node(data);
		
		tail.next=n;
		n.next=null;
		tail=n;
		
	}
	public void removeFirst() {
		head=head.next;
	}
	public void display() {
		Node currNode= head;
		while(currNode!=null) {
			System.out.print(currNode.data +"->");
			currNode=currNode.next;
		}
	}
	public void removeLast() {
		Node secondLast= head;
		 Node lastNode= head.next;
		 
		 while(lastNode.next!=null) {
			 lastNode=lastNode.next;
			 secondLast=secondLast.next;
		 }
		 secondLast.next=null;
	}
	public void insertAtRandom(String userValue, int pos) {
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
