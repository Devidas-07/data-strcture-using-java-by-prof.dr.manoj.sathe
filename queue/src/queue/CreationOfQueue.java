package queue;

import java.util.Scanner;

public class CreationOfQueue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("enter your choice ");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("enter item to be inserted");
				int item= scan.nextInt();
				q.enqueue(item);
				break;
			}
			case 2:{
				q.printQueue();
				break;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}

	}

}

class MyQueue{
	int [] queArr= new int[5];
	int front = -1;
	int rear = -1;
	
	public String enqueue(int item) { 
		if(rear==queArr.length-1) {
			return "queue is full";
		}
		else if(front==-1 && rear==-1){
			front =0;
			rear=0;
			
			queArr[front]=item;
			
			return "element added";
		}
		else {
			rear=rear+1;
			queArr[rear]=item;
			return "element added apart from first index";
		}
	}
	public void printQueue() {
		for(int i: queArr) {
			System.out.print(i +" ");
		}
	}
}