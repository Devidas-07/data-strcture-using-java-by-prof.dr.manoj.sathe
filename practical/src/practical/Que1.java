package practical;

import java.util.Scanner;

public class Que1{
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		QueueDs q = new QueueDs();
		
		while(true) {
			System.out.println("enter your choice ");
			System.out.println("1 for enqueue\t 2 for display\t3 for dequeue\t4 for stop");
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
			case 3:{
				q.dequeue();
				break;
			}
			case 4:
				System.exit(0);
			}
		}

	}
}
class QueueDs{
																								

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
		if(front==-1 && rear==-1) {
			System.out.println("queue is empty");
			return;
		}
		else if(front>rear) {
			System.out.println("queue is empty");
			return;
		}
		for(int i=front; i<=rear; i++) {
			System.out.print(queArr[i]+" ");
		}
	}
	public void dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("queue is empty");
			return;
		}
		else if(front>rear) {
			System.out.println("queue is empty");
			return;
		}
		else {
		front=front+1;
		System.out.println("item deleted successfully");
		}
		
	}
}