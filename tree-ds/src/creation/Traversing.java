package creation;

import java.util.Scanner;



public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bts bt = new Bts();
		Bts.Node root=bt.insertRoot();
		bt.display(root);
		System.out.println("pre order");
		bt.preorder(root);
		System.out.println("in order");
		bt.inorder(root);
		System.out.println("post order");
		bt.postorder(root);

	}

}
class Bts {

	Node root;

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int data) {
			this.value = data;

		}

	}

	public Node insertRoot() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter root value");
		int value = s.nextInt();
		Node root = new Node(value);
		root.value = value;
		System.out.println("do you want to insert " + value + " left");
		boolean ans = s.nextBoolean();
		if (ans) {
			insertAtLeft(root, new Scanner(System.in));
		}
		System.out.println("do you want to insert " + value + " right");
		boolean ans2 = s.nextBoolean();
		if (ans2) {
			insertAtRight(root, new Scanner(System.in));
		}
		return root;
	}

	public void insertAtLeft(Node root, Scanner s) {
		System.out.println("enter left child for " + root.value);
		int value = s.nextInt();
		Node n = new Node(value);
		root.left = n;
		System.out.println("do you want to insert " + value + " left");
		boolean ans = s.nextBoolean();
		if (ans) {
			insertAtLeft(n, new Scanner(System.in));
		}
		System.out.println("do you want to insert right value for " + value);
		boolean ans2 = s.nextBoolean();
		if (ans2) {
			insertAtRight(n, new Scanner(System.in));
		}
	}

	public void insertAtRight(Node root, Scanner s) {
		System.out.println("enter right value for " + root.value);
		int value = s.nextInt();
		Node n = new Node(value);
		root.right = n;
		System.out.println("do you want to insert " + value + " left");
		boolean ans = s.nextBoolean();
		if (ans) {
			insertAtLeft(n, new Scanner(System.in));
		}
		System.out.println("do you want to insert right value for " + value);
		boolean ans2 = s.nextBoolean();
		if (ans2) {
			insertAtRight(n, new Scanner(System.in));
		}
	}

	public void display(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.value+" ");
		display(root.left);
		display(root.right);
		
	}
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
	}
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}

}

