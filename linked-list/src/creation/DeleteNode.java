package creation;

import java.util.Scanner;

public class DeleteNode {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Structure list = new Structure(5);
		int choice;
		do {
			System.out.println("enter your choice:\n 1.insert\t 2.view \t3.remove First\t4.remove Last \t 5.remove Random");
			choice=s.nextInt();
		
			switch(choice) {
			case 1:
				int value = s.nextInt();
				list.insertAtFirst(value);
				break;
			case 2:
				list.display();
				break;
			case 3:
				list.removeFirst();
				break;
			case 4:
				list.removeLast();
				break;
			case 5:
				int num= s.nextInt();
				//list.deleteRandom(num);
			}
		
		
		
		}while(choice>0&& choice<6);

	}
	

}
class Structure{
	 Node head;
	 Node tail;
	 int size;
	 
	 public Structure(int size) {
		 this.size=size;
	 }
	 
	 
	 public void insertAtFirst(int value) {
		 if(head==null) {
			 Node n = new Node(value);
			 head=n;
			 head.ref=null;
			 tail=n;
			 return;
		 }
		 else {
			 Node n = new Node(value);
			 n.ref=head;
			 head=n;
		 }
	 }
	 public void display() {
		 Node temp=head;
		 while(!(temp==null)) {
			 System.out.println(temp.data);
			 temp=temp.ref;
		 }
	 }
	 
	 public void insetAtLast(int value) {
		
		 Node n1 = new Node(value);
		 if(head==null ||tail==null) {
			 head=n1;
			 tail=n1;
			 head.ref=null;
			 tail.ref=null;
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
	 public void deleteRandom(Node random) {
		if(random.ref==null) {
			System.out.println("cannot delete ");
		}
		random=random.ref;
		random.ref=random.ref.ref;
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
