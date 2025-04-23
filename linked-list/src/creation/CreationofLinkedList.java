package creation;

public class CreationofLinkedList {

	public static void main(String[] args) {
		
		Ll l = new Ll(3);
		
		l.insertAtFirst(87);
		l.insertAtFirst(80);
		l.insertAtFirst(82);
		l.insetAtLast(99);
		l.display();
		//l.removeFirst();
		l.removeLast();
		System.out.println("after deleting");
		l.display();
		
	}

}
 class Ll{
	 Node head;
	 Node tail;
	 int size;
	 
	 public Ll(int size) {
		 this.size=size;
	 }
	 
	 
	 public void insertAtFirst(int value) {
		 Node n = new Node(value);
		 n.ref=head;
		 head = n;
		 
		 if(tail==null) {
			 tail=head;
		 }
		 size+=1;
	 }
	 public void display() {
		 Node temp=head;
		 while(!(temp==null)) {
			 System.out.println(temp.data);
			 temp=temp.ref;
		 }
	 }
	 
	 public void insetAtLast(int value) {
		
		 Node n1 = new Node(12);
		 if(head==null) {
			 
		 }
		 tail.ref=n1;
		 tail=n1;
		 
		 size++;
	 }
	 public void removeFirst() {
		head=head.ref;
	 }
	 public void removeLast() {
		 Node secondLast= head;
		 Node lastNode= head.ref;
		 
		 while(lastNode.ref!=null) {
			 lastNode=lastNode.ref;
			 secondLast=secondLast.ref;
		 }
		 secondLast.ref=null;
	 }
	 class Node{
			int data;
			Node ref;
			
			public Node(int value) {
				this.data=value;
			}
			public Node(int value, Node link) {
				this.data=value;
				this.ref=link;
				
			}
		}
}