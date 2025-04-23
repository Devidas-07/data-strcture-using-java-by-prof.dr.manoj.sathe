class DoublyLL {
	public static class Node
	{
		int val;
		Node next;
		Node prev;
		
		Node(int val)
		{
			this.val = val;
		}
	}
	
	public static void display(Node head)  //Method to display complete linked list from head
	{
		Node temp = head;
		while(temp!=null)
		{ 
			System.out.print(temp.val+" ");
			temp = temp.next; //Moving forward
		}
		System.out.println();
	}
	
	public static void displayrev(Node tail)  //Method to display complete linked list from tail
	{
		Node temp = tail;
		while(temp!=null)
		{ 
			System.out.print(temp.val+" ");
			temp = temp.prev; //Moving Backward
		}
		System.out.println();
	}
	
	public static void displayrandom(Node random)  //Method to display complete linked list from tail
	{
		Node temp = random;
		while(temp.prev!=null)
		{ 
			temp = temp.prev; //Moving Backward till we get head. (Where head prev is always null)
		}
		
		//At this point temp is pointing at head... we will start printing linkedlist in forward direction
		while(temp!=null)
		{ 
			System.out.print(temp.val+" ");
			temp = temp.next; //Moving forward
		}
		System.out.println();
		
		System.out.println();
	}
	
	public static Node insertatHead(Node head,int x) //Insert new Node at First Position
	{
		Node n = new Node(x);
		n.next = head; //New Node will point to current head 
		head.prev = n; //previous of current head will point to t 
		head = n ; //Here we will assign head to n 
		
		return head;
	}
	
	public static void insertAtTail(Node head,int x)
	{
		//First we will reach to tail
		Node temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		
		//Here we reached at tail. Now we will insert new node at tail
		Node t = new Node(x); //Create a node which we want to insert at last
		temp.next = t;
		t.prev = temp;
		
	}
	public static void insertAtRandom(Node head, int x, int pos) {
		int count = 1;
		Node temp = head;
		Node middle = new Node(x);
		while(count<=pos) {
			temp= temp.next;
		}
		temp.prev=middle.next;
		
	}
	
	public static void main(String[] args)
	{
		//14 20 2 79 43
		
		Node a  = new Node(14);
		Node b  = new Node(20);
		Node c  = new Node(2);
		Node d  = new Node(79);
		Node e  = new Node(43);
		
		a.prev = null; //First Node previous will be always pointing to null
		a.next = b; //Forward Travesal
		b.prev = a; //Backward Travesal
		b.next = c; //Forward Travesal
		c.prev = b; //Backward Travesal
		c.next = d; //Forward Travesal
		d.prev = c; //Backward Travesal
		d.next = e; //Forward Travesal
		e.prev = d; //Backward Travesal
		e.next = null; //Last Node next will be always pointing to null
		
//		display(a); //Printing Linked List from head
//		displayrev(e); //Printing Linked List from tail 
//		displayrandom(d); //Printing Linked List from head with any random node (Change node for testing)
		
		Node newHead = insertatHead(a,77); //Insertion of new Node at first position of DLL
		//display(newHead);
		
		//insertAtTail(a,88); //Insertion of new node 88 at tail but we have given head node
		//display(a);
		//insertAtRandom(a, 5, 3);
		display(a);
	}
}