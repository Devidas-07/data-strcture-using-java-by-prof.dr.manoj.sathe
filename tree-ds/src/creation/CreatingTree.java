package creation;

import java.util.Scanner;

public class CreatingTree {

	public static void main(String[] args) {
		BinaryTreeStructure bt = new BinaryTreeStructure();
		BinaryTreeStructure.Node root=bt.insertRoot();
		System.out.println(root.value);
		bt.display(root);
	}

}

class BinaryTreeStructure {

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
			insertAtRight(n, new Scanner(System.in));
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

}
